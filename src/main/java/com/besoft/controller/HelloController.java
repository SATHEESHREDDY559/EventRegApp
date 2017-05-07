package com.besoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = "/greeting")
	public String home(Model model){
		model.addAttribute("greeting", "Hello, Spring MVC4");
		return "home";
	}
}
