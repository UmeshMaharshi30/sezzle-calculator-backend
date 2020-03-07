package com.sezzle.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan({"com.sezzle.controller", "com.sezzle.socket"})
@SpringBootApplication
public class SezzleCalculatorBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SezzleCalculatorBackendApplication.class, args);
	}

}
