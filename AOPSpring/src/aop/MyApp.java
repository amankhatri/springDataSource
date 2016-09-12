package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("aop/beans.xml");
		EmployeeService es = appCtxt.getBean(EmployeeService.class);
		es.employee.setName("JavaSpring");
		//es.employee.getName();
		//es.employee.getMoreName();

	}

}
