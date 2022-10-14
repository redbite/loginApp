package com.example.loginApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.loginApp.entity.User;
import com.example.loginApp.repository.UserRepository;

@Controller
public class LoginAppController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("")	
	public String viewHomePage() {
		return "index";	//	src/main/resources/templates
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		model.addAttribute("user",new User());
		
		return "signup_form";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		userRepository.save(user);
		return "register_success";
	}
}
