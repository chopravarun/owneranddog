package com.richassest.ownerAndDog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {
    @GetMapping("/")
    public String index(){
        return "Welcome to Rich Assets";
    }
}
