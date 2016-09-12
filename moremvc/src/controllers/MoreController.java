package controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoreController {
	
	@RequestMapping("/users")
	public ModelAndView doGenerateUsers(){
		ModelAndView mv = new ModelAndView("users");
		Map<String,Object> mapInfo = mv.getModel();
		mapInfo.put("hobbies", "Cricket, Tennis, Kabbadi");
		return mv;
	}

}
