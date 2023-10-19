package com.luv2code.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // printar um hello world

    @GetMapping("/")

    public String sayHello(){
        return "Hello World";
    }
}
