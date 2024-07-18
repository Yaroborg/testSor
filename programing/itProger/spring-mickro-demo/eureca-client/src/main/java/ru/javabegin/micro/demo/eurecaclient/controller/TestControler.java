package ru.javabegin.micro.demo.eurecaclient.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class TestControler {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
