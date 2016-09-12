package ann;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ann/newbeans.xml");
		
        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
         
        //System.out.println(employeeService.getEmployee().getName());
         
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        employeeService.getEmployee().setName(data);
        employeeService.getEmployee().setChar(data,data);
        employeeService.getEmployee().setId(6);
        
         
        //employeeService.getEmployee().throwException();
         
        ctx.close();
		

	}

}
