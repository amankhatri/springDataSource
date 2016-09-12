package annotationbased.copy;

import shoes.Bata;
import shoes.Shoe;
import shoes.Puma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("shoes")
public class AppConfig {
	
	@Bean(name="bata")
	@Scope("prototype")
	public Bata getbata(){
		return new Bata();
	}
	
	@Bean
	public String getString(){
		return "hello";
	}
	
//	@Bean(name="bata2")
//	public Bata getbata2(){
//		return new Bata();
//	}

}
