package com.cg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/hello2")
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

	@GetMapping("/feature2")
	public String feature2() {
		return "feature2";
	}

	
	@GetMapping("/feature1")
	public String world1() {
		return "feature1";
	}

	
	@GetMapping("/feature3")
	public String feature3() {
		return "feature3";
	}

}
