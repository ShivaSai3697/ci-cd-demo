package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String home() {
        return "Hello from CI/CD Demo!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
