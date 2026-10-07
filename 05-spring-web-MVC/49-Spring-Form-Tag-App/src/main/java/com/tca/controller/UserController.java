package com.tca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tca.model.User;

@Controller
public class UserController {
	
	@GetMapping("/form")
	public String ShowForm(Model model) {
		
		User u=new User();
		u.setUsername("Akki");//
		u.setEmail("akshay09@gmail.com");
		model.addAttribute("user", u);
		return "User";
	}
	
	@PostMapping("/register")
	public String handlerForm(@ModelAttribute User user,Model model) {
		
		String msg="I Love India";
		
		model.addAttribute("msg", msg);
		model.addAttribute("a",user.getUsername());
		model.addAttribute("b",user.getEmail());
		model.addAttribute("c",user.getMobile());
		model.addAttribute("d",user.getGender());
		

		return "userDetails";
	}

}
