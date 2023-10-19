package com.test.springcoredemo.common;


//bean sem a anotation @configuration
public class SantasticoMatches implements Matches{


    public SantasticoMatches() {
        System.out.println("Santos construiu");
    }

    @Override
    public String matchesBrasileirao() {
        return "Santos acabou";
    }
}
