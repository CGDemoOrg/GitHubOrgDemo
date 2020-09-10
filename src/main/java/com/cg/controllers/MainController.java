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
<<<<<<< HEAD
<<<<<<< HEAD
=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< .mine




=======
	@GetMapping("/feature2")
	public String feature2() {
		return "feature2";
	}
>>>>>>> .theirs
=======
=======
>>>>>>> 9d9b1d6... added feature 1
	
	@GetMapping("/feature1")
	public String world() {
		return "feature1";
	}
<<<<<<< HEAD
>>>>>>> 9d9b1d6... added feature 1
=======
	
	@GetMapping("/feature3")
	public String feature3() {
		return "feature3";
	}
>>>>>>> 4f465ad... added feature3
>>>>>>> 4916eae... added feature3
=======
>>>>>>> 9d9b1d6... added feature 1
}
