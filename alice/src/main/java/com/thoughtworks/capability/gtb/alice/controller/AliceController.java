package com.thoughtworks.capability.gtb.alice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class AliceController {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("http://bob:8081/hello")
    private String uri;

    @RequestMapping("/hello")
    public String sendRequest() {
        return restTemplate.getForObject(uri, String.class);
    }
}
