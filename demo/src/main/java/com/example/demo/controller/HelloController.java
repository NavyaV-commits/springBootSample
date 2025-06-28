package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
public clas HelloController {
	
	@GetMapping("/hello")
	public Stng sayHello() {
		return "Hello from Spring Boot 2!";
	}
}
