package com.aasif.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping
	public String hellow() {
		return "Hello Spring Boot";
	}
}
