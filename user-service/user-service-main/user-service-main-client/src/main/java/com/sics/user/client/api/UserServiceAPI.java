package com.sics.user.client.api;

import com.sics.base.common.result.SimpleResult;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "user-service", contextId = "sics-user-UserServiceAPI")
@RequestMapping("/user/user")
@Validated
public interface UserServiceAPI {
    @GetMapping("/pwdHash/{username}")
    SimpleResult<String> getPasswordHash(
            @PathVariable("username")
            @NotBlank(message = "用户名不能为空")
            @Size(min = 4, max = 20, message = "用户名长度必须在4-20个字符之间")
            String username);
}
