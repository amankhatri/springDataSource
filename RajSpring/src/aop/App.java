package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appCtxt = new ClassPathXmlApplicationContext("aop/beans.xml");
		EmployeeService empService = appCtxt.getBean("employeeService",EmployeeService.class);
		
		empService.employee.setName("Hello");
		String ename = empService.employee.getName();
		System.out.println(ename);
		
        appCtxt.close();

	}

}
