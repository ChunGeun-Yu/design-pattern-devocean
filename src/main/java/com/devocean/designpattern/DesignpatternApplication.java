package com.devocean.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication(scanBasePackages = "com.devocean.designpattern.v1")
public class DesignpatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignpatternApplication.class, args);
	}

}
