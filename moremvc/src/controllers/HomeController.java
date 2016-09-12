package controllers;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.StudentJDBCTemplate;
import dao.App;

@Controller
public class HomeController {
	
	
	private StudentJDBCTemplate studentTemp;
	
	

    public HomeController() {
		System.out.println("Constructing ...");
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("DaoBeans.xml");

	    this.studentTemp = 
	      (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");   
	}

	
	public void setStudentTemp(StudentJDBCTemplate studentTemp) {
		this.studentTemp = studentTemp;
	}

	@RequestMapping("/")
	public String doGenerateHome(HttpSession session){
		
		studentTemp.create("road", 9262);
		
		session.setAttribute("name", "Spring is awesome");
		return "index";
	}
	
	@RequestMapping("/aboutus")
	public String doGenerateAboutUs(HttpSession session){
		session.setAttribute("name", "This is about Us");
		return "index";
	}
	
	@RequestMapping("/form")
	public String doGenerateForm(){
		return "form";
	}
	
	
	@RequestMapping("/info")
	public String doGenerateInfo(@RequestParam("id") String id, Model model){
		model.addAttribute("hobbies", "singing, dancing");
		model.addAttribute("sports", id);
		return "users";
	}
	
	

}
