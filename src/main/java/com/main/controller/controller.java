package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	
	@GetMapping
	public String  getStudent() {
	
		return "Hello, i am bhushan Galphade java full stack developer...";
	}

}
