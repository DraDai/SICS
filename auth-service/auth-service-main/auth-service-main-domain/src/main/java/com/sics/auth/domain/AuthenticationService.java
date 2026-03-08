package com.sics.auth.domain;

import com.sics.auth.domain.dto.LoginCommand;
import com.sics.auth.domain.dto.LoginResult;
import com.sics.auth.domain.respository.PasswordEncoder;
import com.sics.auth.domain.respository.TokenGenerator;
import com.sics.auth.domain.respository.UserRepository;
import com.sics.base.common.ex.BaseException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final TokenGenerator tokenGenerator;


    public LoginResult login(LoginCommand loginCommand) {
        // 访问用户服务，找到加密的密码
        String passwordHash = userRepository.findPasswordHashByUsername(loginCommand.getUsername())
                .orElseThrow(() -> new BaseException("用户不存在"));

        // 将用户输入的密码加密，与加密的密码进行比较
        if(!passwordEncoder.match(loginCommand.getPassword(), passwordHash)) {
            throw new BaseException("密码错误");
        }
        String token = tokenGenerator.generateToken(loginCommand.getUsername());
        return LoginResult.builder().token(token).build();
    }
}
