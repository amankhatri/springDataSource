package springmvc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.Offer;
import dao.OffersDAO;

@Controller
public class OffersController {
	
//	@RequestMapping("/")
//    public String showHome(HttpSession session){
//		session.setAttribute("name", "Spring");
//    	return "home";
//    }
	
//	@RequestMapping("/")
//    public ModelAndView showHome(){
//	    ModelAndView mv = new ModelAndView("home");
//	    Map<String,Object> model = mv.getModel();
//	    model.put("name", "MoreToSpring");
//    	return mv;
//    }
	
	private OffersDAO offersDAO;
	
	@Autowired
	public void setOffersDAO(OffersDAO offersDAO){
		this.offersDAO = offersDAO;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
    public String moreOffers(Model model, @RequestParam("id") String id){
		System.out.println("Id is " + id);
		return "home";
	}
	
	@RequestMapping("/")
    public String showOffers(Model model){
	    
//	    AbstractApplicationContext context = new AnnotationConfigApplicationContext(OffersDAO.class);
//	    OffersDAO bean = (OffersDAO) context.getBean("offersDao");
	//    List<Offer> l = bean.getOffers();
//	    
//	    System.out.println(l);
	    List<Offer> offers = offersDAO.getOffers();
	    model.addAttribute("offers",offers);
	    return "home";
    }
}
