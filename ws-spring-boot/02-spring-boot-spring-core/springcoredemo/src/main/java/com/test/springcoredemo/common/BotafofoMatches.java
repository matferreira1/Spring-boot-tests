package com.test.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class BotafofoMatches implements Matches{

    // define o metodo que inicia
    /*@PostConstruct
    public void aClasseIniciou(){
        System.out.println(getClass().getSimpleName() + " comecou");
    }

    // define o metodo que acaba
    @PreDestroy
    public void aClasseAcabou(){
        System.out.println(getClass().getSimpleName() + " time da malandragem");
    }*/

    @Override
    public String matchesBrasileirao() {
        return "BOTxCOR";
    }
}
