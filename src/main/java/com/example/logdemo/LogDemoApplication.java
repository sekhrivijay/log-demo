package com.example.logdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class LogDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogDemoApplication.class, args);
	}


	public String getMeesage() {
		return "Hello worldsss";
	}
}
