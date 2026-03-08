package com.sics.auth.infra.respository;

import com.sics.auth.domain.respository.PasswordEncoder;
import com.sics.base.security.PasswordUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderImpl implements PasswordEncoder {
    @Override
    public boolean match(String rawPassword, String passwordHash) {
        String encode = PasswordUtil.encode(rawPassword);
        return encode.equals(passwordHash);
    }
}
