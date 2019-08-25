package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    //我是dev
    @RequestMapping("/test")
    public String testController(){
        return "index";
    }
}
