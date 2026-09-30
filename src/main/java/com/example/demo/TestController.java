package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/text")
    public String getText() {
        return "тест надпись";
    }

    @GetMapping("/number")
    public int getNumber() {
        return 42;
    }
}