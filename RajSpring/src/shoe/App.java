package shoe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext supplier = new FileSystemXmlApplicationContext("beansInfo.xml");
		Shoe s = (Shoe)supplier.getBean("re1");
		s.doMakeComfortable();
		//((Rebook)s).price = 100;
		
		ShoeFactory sf = (ShoeFactory)supplier.getBean("sf");
		sf.shoe.doMakeComfortable();
		
		Shoe s1 = (Shoe)supplier.getBean("re1");
		s1.doMakeComfortable();
		//((Rebook)s1).price = 1000;
		System.out.println(((Rebook)s1).price + " " + ((Rebook)s).brands);

	}

}
