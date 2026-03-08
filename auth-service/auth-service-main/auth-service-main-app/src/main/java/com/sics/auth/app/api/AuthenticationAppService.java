package com.sics.auth.app.api;

import com.sics.auth.client.dto.LoginRequest;
import com.sics.auth.client.dto.LoginResponse;

public interface AuthenticationAppService {

    LoginResponse login(LoginRequest loginRequest);
}
