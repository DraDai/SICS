package com.sics.auth.domain.respository;

import java.util.Optional;

public interface UserRepository {

    public Optional<String> findPasswordHashByUsername(String username);
}
