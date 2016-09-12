package dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String argv[]) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("DaoBeans.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	      (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      
	      studentJDBCTemplate.create("awi", 22);

	}

}
