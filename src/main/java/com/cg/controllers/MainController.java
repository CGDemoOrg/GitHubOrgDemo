package com.cg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World";
	}
	//change
	@GetMapping("/hi")
	public String hi() {
		return "Hi";
	}
	
	@GetMapping("/world")
	public String world() {
		return "world";
	}
}
