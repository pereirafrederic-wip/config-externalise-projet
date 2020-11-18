package com.pereirafrederic.projetconfigexternalise;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/main")
public class Controller {

    @Value("${name}")
    private String name;

    @GetMapping(name = "/name")
    public String get(){

        return name;
    }
}
