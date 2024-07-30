package com.spring.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.practice.model.LoginModel;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class LoginController {
	
	@GetMapping(value = "/login")
	public String init(Model model) {
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	@PostMapping(value = "/login")
	public String login(@ModelAttribute LoginModel request, Model model) {
		System.out.println("Email ======" + request.getEmail());
		System.out.println("PASSWORD=====" + request.getPassword());
		log.debug("EMAIL ==-===============" + request.getEmail());
		log.debug("PASSWORD================" + request.getPassword());
		return "result";
	}

}
