package com.iet.AssignmentSpringBootUser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyUserController {
	
	@GetMapping("/")
	public ModelAndView sayHello() {
		return new ModelAndView("hello");
		
	}

}
