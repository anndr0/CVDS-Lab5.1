package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ServingWebContentApplication {
	@RequestMapping("/")
	public String home() {
		return "Hello world Spring Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}
}
