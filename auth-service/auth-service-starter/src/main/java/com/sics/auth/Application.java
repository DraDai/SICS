package com.sics.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication(scanBasePackages = "com.sics.user")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sics.user.client")
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        logApplicationStartup(context.getEnvironment());
    }

    private static void logApplicationStartup(ConfigurableEnvironment environment) {
        String appName = environment.getProperty("spring.application.name", "application");
        String a = "1";
    }
}
