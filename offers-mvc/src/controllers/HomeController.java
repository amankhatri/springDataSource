package controllers;

import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="/{Id}")
	public String showHome(@PathVariable String Id, HttpSession session){
		System.out.println("Home coming");
		session.setAttribute("name", Id);
		return "home";
	}

}
