package com.richassest.ownerAndDog.controller;

import com.richassest.ownerAndDog.dao.Tick;
import com.richassest.ownerAndDog.dao.repos.TickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @Autowired
    TickRepository repo;

    @GetMapping("/")
    public String index(){
        Tick t = new Tick("nifty", "17500");
        repo.save(t);
        return "Welcome to Rich Assets and testing";
    }
}
