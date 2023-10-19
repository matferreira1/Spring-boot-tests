package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    // criar um /hello
    @GetMapping("/hello")
    public String sayHello(Model model){

        model.addAttribute("date", new java.util.Date());
        return "helloworld";
    }
}
