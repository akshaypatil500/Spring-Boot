package com.tca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String show(@RequestParam("un") String un,Model model) {	
		
		model.addAttribute("name",un);
		return "Hello";
		
	}

}
