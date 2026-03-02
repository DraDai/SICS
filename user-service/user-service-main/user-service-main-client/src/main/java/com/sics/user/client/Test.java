package com.sics.user.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Test {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service! 访问成功！";
    }
}
