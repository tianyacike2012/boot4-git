package com.kl.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public String info(){
        return "info";
    }

    @RequestMapping("/say")
    public String say(){
        return "say Hello";
    }
}
