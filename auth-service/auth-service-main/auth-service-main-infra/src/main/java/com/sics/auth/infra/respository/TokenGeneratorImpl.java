package com.sics.auth.infra.respository;

import com.sics.auth.domain.respository.TokenGenerator;
import com.sics.base.security.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TokenGeneratorImpl implements TokenGenerator {
    private final JwtUtils jwtUtils;
    @Override
    public String generateToken(String username) {
        return jwtUtils.generateToken(username);
    }
}
