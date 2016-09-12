package annotationbased.copy;

import shoes.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Bata b = (Bata)app.getBean("bata");
		
		ShoeParlor s = (ShoeParlor)app.getBean(ShoeParlor.class);
		System.out.println(s.b);

	}

}
