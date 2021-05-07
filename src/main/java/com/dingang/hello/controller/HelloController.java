package com.dingang.hello.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity helloDemo(int id) {
        System.out.println("命中了===" + id);
        return ResponseEntity.ok("相应数据：  Hello=" + id);
    }


}
