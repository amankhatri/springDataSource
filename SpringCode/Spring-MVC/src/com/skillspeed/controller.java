package com.skillspeed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@RequestMapping("/")
	public String showPage(){
		return "main";
	}

}
