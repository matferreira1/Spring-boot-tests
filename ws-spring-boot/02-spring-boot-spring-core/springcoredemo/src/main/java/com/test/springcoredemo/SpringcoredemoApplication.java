package com.test.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//aplication que utiliza o util
//@SpringBootApplication(scanBasePackageClasses = {"com.test.springcoredemo", "com.test.util"})

@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
