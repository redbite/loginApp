package com.example.loginApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginAppController {
	
	@GetMapping("")	
	public String viewHomePage() {
		return "index";	//	src/main/resources/templates
	}
}
