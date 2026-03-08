package com.sics.auth.app.service;

import com.sics.auth.app.api.AuthenticationAppService;
import com.sics.auth.app.assembler.AuthenticationAssembler;
import com.sics.auth.client.dto.LoginRequest;
import com.sics.auth.client.dto.LoginResponse;
import com.sics.auth.domain.AuthenticationService;
import com.sics.auth.domain.dto.LoginCommand;
import com.sics.auth.domain.dto.LoginResult;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationAppServiceImpl implements AuthenticationAppService {
    private final AuthenticationService  authenticationService;
    private final AuthenticationAssembler  authenticationAssembler;

    public AuthenticationAppServiceImpl(AuthenticationService authenticationService, AuthenticationAssembler authenticationAssembler) {
        this.authenticationService = authenticationService;
        this.authenticationAssembler = authenticationAssembler;
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        LoginCommand loginCommand = authenticationAssembler.toLoginCommand(loginRequest);
        LoginResult loginResult = authenticationService.login(loginCommand);
        return authenticationAssembler.toLoginResponse(loginResult);
    }
}
