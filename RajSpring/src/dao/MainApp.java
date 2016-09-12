package dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = 
	             new FileSystemXmlApplicationContext("DaoBeans.xml");

	      StudentJDBCTemplate studentJDBCTemplate = 
	      (StudentJDBCTemplate)context.getBean("studentJDBCTemplate");
	      
	      
	      studentJDBCTemplate.create("Awi", 30);
	      
	}

}
