package com.example.servingwebcontent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ServingWebContentApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello world Spring Boot";
	}

	@RequestMapping("/api/hello")
	public String hello() {
		return "Integrantes: Ana Duran, Johan Estrada, Juan Contreras";
	}


	public static void main(String[] args) {
		SpringApplication.run(ServingWebContentApplication.class, args);
	}
}

