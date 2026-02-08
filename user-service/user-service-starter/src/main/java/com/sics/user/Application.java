package com.sics.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication(scanBasePackages = "com.sics.user")
public class Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        logApplicationStartup(context.getEnvironment());
    }

    private static void logApplicationStartup(ConfigurableEnvironment environment) {
        String appName = environment.getProperty("spring.application.name", "application");
    }
}
