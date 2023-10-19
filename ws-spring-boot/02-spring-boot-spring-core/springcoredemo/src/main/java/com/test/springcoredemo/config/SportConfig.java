package com.test.springcoredemo.config;

import com.test.springcoredemo.common.Matches;
import com.test.springcoredemo.common.SantasticoMatches;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //construindo um bean de nome santos
    @Bean("santos")
    public Matches santasticoMatches(){
        return new SantasticoMatches();
    }

}
