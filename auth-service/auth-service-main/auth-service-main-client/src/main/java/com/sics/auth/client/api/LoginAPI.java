package com.sics.auth.client.api;

import com.sics.auth.client.dto.LoginRequest;
import com.sics.auth.client.dto.LoginResponse;
import com.sics.base.common.result.SimpleResult;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "auth-service", contextId = "sics-auth-LoginAPI")
@RequestMapping("/auth")
public interface LoginAPI {
    @GetMapping("/login")
    SimpleResult<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest);
}
