package com.alimate.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RefreshScope
@RestController
@RequestMapping("/greeting")
public class ConfigClientService {
    @Value("${configuration.greet.name: Ali}") private String name;

    @RequestMapping(method = GET)
    public String greet() {
        return "Hello " + name;
    }
}