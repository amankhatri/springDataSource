package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext bean = new FileSystemXmlApplicationContext("beans.xml");
		Burger p = ((Burger)bean.getBean("burger"));
		p.doServeHot();
		
		
		p.setIngredents("yet to be decided");
		Burger p2 = ((Burger)bean.getBean("burger"));
		System.out.println(p.option + p.ingredents +p.address.add);
		System.out.println(p2);
	}

}
