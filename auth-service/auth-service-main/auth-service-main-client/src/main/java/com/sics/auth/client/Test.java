package com.sics.auth.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class Test {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from User Service! 访问成功！";
    }
}
