package com.springcarrito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcarrito.dao.UserPersonInterface;
import com.springcarrito.entity.UserPerson;

@Controller
public class UserPersonController {
	
	@Autowired
	private UserPersonInterface userPersonInterface;
	
	@PostMapping("/user-create")
	public String createUserPerson(UserPerson userperson) {
		System.out.print(userperson.toString());
		userPersonInterface.save(userperson);
		
		return "redirect:/register";
	}
	
}
