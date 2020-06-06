package com.thoughtworks.capability.gtb.bob.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BobController {
    @GetMapping("/hello")
    public String helloBob() {
        return "Hello from Bob!";
    }
}
