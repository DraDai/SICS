package com.sics.auth.infra.respository;

import com.sics.auth.domain.respository.UserRepository;
import com.sics.base.common.result.SimpleResult;
import com.sics.base.common.utils.FeignResultUtil;
import com.sics.user.client.api.UserServiceAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final UserServiceAPI userServiceAPI;
    @Override
    public Optional<String> findPasswordHashByUsername(String username) {
        SimpleResult<String> passwordHash = userServiceAPI.getPasswordHash(username);
        String passwordHashStr = FeignResultUtil.extractData(passwordHash);
        return Optional.ofNullable(passwordHashStr);
    }
}
