package com.springcarrito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springcarrito.entity.UserPerson;

@Controller
public class ViewController {


	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute("userperson") UserPerson userPerson, BindingResult bindingResult, Model model) {
		
		return "register";
	}
}
