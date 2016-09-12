package base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext bean = new AnnotationConfigApplicationContext(AppConfig.class);
		 Food f = (Food) bean.getBean("Hotel");
         f.doServeHost();
	}

}
