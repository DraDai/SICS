package com.sics.user.entry.controller;

import com.sics.base.common.result.SimpleResult;
import com.sics.user.app.api.UserQueryService;
import com.sics.user.client.api.UserServiceAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController implements UserServiceAPI {
    private final UserQueryService userQueryService;
    @Override
    public SimpleResult<String> getPasswordHash(String username) {
        String passwordHash = userQueryService.getPasswordHash(username);
        return SimpleResult.buildSuccess(passwordHash);
    }
}
