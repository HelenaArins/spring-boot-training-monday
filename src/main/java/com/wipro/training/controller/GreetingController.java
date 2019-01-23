package com.wipro.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.wipro.training.service.GreetingService;

//@Controller
public class GreetingController {
	
	private GreetingService greettingService;
	
	@Autowired
	public GreetingController(GreetingService greetingService) {
		this.greettingService = greetingService;
	}

	public String greeting() {
		return greettingService.sayHello();
	}

//	@Qualifier("valyrianService")	
//	@Autowired
//	public void setGreettingService(GreetingService greettingService) {
//		this.greettingService = greettingService;
//	}
}
