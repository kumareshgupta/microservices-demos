package com.kg.eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class CalculatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorServiceApplication.class, args);
	}

	@RequestMapping("/sum/{num1}/{num2}")
	public int sum(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		return num1 + num2;
	}
	
	@RequestMapping(value="/")
	public String home() {
		return "Calculator Service Application";
	}
	
}
