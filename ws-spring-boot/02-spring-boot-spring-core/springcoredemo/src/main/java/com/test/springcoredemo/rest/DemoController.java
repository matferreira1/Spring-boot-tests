package com.test.springcoredemo.rest;

import com.test.springcoredemo.common.Matches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define um objeto para a dependencia
    private Matches matches;


    //define um construtor para a dependencia
    @Autowired
    public DemoController(@Qualifier("santos") Matches matches){
        this.matches=matches;
    }

    // define endpoint
    @GetMapping("/matches")
    public String getMatches() {
        return matches.matchesBrasileirao();
    }


}
