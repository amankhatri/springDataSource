package controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	String getHome(){
		ModelAndView model = new ModelAndView("home");
		Map<String,Object> mapmodel = model.getModel();
		mapmodel.put(, value);
		return "index";
	}

}
