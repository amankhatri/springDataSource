package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext a = new AnnotationConfigApplicationContext(Configurator.class);
		ShoeCompany s = a.getBean(ShoeCompany.class);
		s.shoe.makeFeelComfortable();
		ShoeCompany s2 = a.getBean(ShoeCompany.class);
		s2.shoe.makeFeelComfortable();
		((Bata)(s2.shoe)).model = "abc";
		System.out.println(((Bata)(s.shoe)).model);
		s2.size  =7;
		System.out.println(s.size);
		
		for(int i =0; i < 10; i++){
			Shoes r = a.getBean(Shoes.class);
			s2.shoes.add(r);
		}
		System.out.println(s2.shoes);

	}

}
