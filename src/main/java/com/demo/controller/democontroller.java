package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class democontroller {
	@GetMapping("/get")
	public String show() {
		return "Welcome to corporate";
	}
	
	@GetMapping("/set")
	public String show1() {
		return "Patta daal lo";
	}

}
