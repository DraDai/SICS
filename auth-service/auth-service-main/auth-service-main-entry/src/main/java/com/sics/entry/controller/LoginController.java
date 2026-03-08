package com.sics.entry.controller;

import com.sics.auth.app.api.AuthenticationAppService;
import com.sics.auth.client.api.LoginAPI;
import com.sics.auth.client.dto.LoginRequest;
import com.sics.auth.client.dto.LoginResponse;
import com.sics.base.common.result.SimpleResult;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController implements LoginAPI {
    private final AuthenticationAppService authenticationAppService;

    public LoginController(AuthenticationAppService authenticationAppService) {
        this.authenticationAppService = authenticationAppService;
    }

    @Override
    public SimpleResult<LoginResponse> login(LoginRequest loginRequest) {
        /*
         * 接收账号密码，校验账号密码，返回token
         */
        LoginResponse loginResponse = authenticationAppService.login(loginRequest);
        return SimpleResult.buildSuccess(loginResponse);
    }
}
