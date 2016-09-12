package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="smallpizza")
	Food getFood(){
		System.out.println("Creating Pizza");
		return new Pizza();
	}
	
	@Bean(name="bigpizza")
	Pizza[] getMoreFood(){
		System.out.println("Creating More Pizza");
		Pizza p[] = new Pizza[10];
		for(int i = 0; i < 10; i++){
			
			//Recepie r = (Recepie)
			p[i] = new Pizza();
		}
		return p;
	}
	
	@Bean(name="recepie")
	@Scope("prototype")
	Recepie getRecepie(){
		System.out.println("Creating Recepie");
		return new Recepie("Chicken");
	}
	
	@Bean(name="morerecepie")
	Recepie getMoreRecepie(){
		System.out.println("Creating Recepie");
		return new Recepie("Chicken");
	}
	

}
