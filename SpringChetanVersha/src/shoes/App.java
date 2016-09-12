package shoes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new FileSystemXmlApplicationContext("beans.xml");
		Bata b = (Bata) appCtxt.getBean("newBataShoe");
		Bata b1 = (Bata) appCtxt.getBean("newBataShoe");
		
		System.out.println(b.getPrice() + " " + b1.getPrice());
		
		ShoeOutlet s = (ShoeOutlet)appCtxt.getBean("shoeoutlet");
		s.b.doMakeFeetComfortable();
		s.p.doMakeFeetComfortable();
		
		

	}

}
