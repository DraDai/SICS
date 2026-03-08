package com.sics.auth.domain.respository;

public interface PasswordEncoder {
    boolean match(String rawPassword, String passwordHash);
}
