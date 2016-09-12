package shoe;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appconfig = new AnnotationConfigApplicationContext(BeanConfig.class);
		ShoeFactory sf = (ShoeFactory)appconfig.getBean(ShoeFactory.class);
		sf.shoe.doMakeComfortable();
		
		sf.shoelist = new ArrayList<>();
		
		for (int i = 0; i < 10; i++){
		    Shoe s = (Shoe)appconfig.getBean("s1");
			sf.shoelist.add(s);
		}
		Shoe s = (Shoe)appconfig.getBean("s1");
		((Rebook)s).price = 10;
		sf.shoelist.add(s);
		System.out.println(sf);
	}

}
