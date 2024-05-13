package com.example.restservice.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Brother {
    @GetMapping("/carlao")
    public String func() {
        return "carlao";
    }
}
