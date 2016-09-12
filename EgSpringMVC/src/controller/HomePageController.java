package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HomePageController extends AbstractController {
	   /**
	    * Provides access to GeekNews business methods
	    */
	   //private GeekNewsService service;

	   /**
	    * Responsible for translating a web request into a ModelAndView object for presentation
	    */
	   @Override
	   protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
	      
	      // Use the service to load the articles
	      //List<NewsArticle> articles = null;//service.getArticleOverviews();
		   List articles = null;
	      // Send the articles to the "home" view
	      return new ModelAndView( "home", "articles", articles );
	   }
	   
	   /**
	    * Injected by Spring
	    * @param service
	    */
//	   public void setGeekNewsService( GeekNewsService service ) {
//	      this.service = service;
//	   }


	}