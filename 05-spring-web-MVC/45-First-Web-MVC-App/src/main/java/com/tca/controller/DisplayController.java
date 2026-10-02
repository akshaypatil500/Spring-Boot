package com.tca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DisplayController {

	@GetMapping("msg")
	public String getMessage() {
		
		return "Hello"  ;  // prefix         + Logical-name + suffix
		                   // /WEB-INF/views + Hello        + .jsp
		                   // "/WEB-INF/views/Hello.jsp" 
	}
}
