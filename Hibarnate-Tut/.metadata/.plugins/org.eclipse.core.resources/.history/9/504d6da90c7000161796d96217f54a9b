package Day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = (Employee)appCtxt.getBean(Employee.class);
//		System.out.println(e);
//		System.out.println(e.getName());
//		
//		e.getName();
		
		e.getSalary();

	}

}
