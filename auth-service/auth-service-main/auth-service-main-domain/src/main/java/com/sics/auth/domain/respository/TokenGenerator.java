package com.sics.auth.domain.respository;

public interface TokenGenerator {
    String generateToken(String username);
}
