package com.alimte;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@SpringBootApplication
public class Application {
    @Value("${configuration.greet.name:start}") private String config;

    @RequestMapping(value = "/greet")
    public String getConfig() {
        return config;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}