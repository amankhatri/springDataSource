package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("beans")
public class Configurator {
	
	@Bean
	@Scope("prototype")
	Shoes getAShoe(){
		return new Bata();
	}
	
//	@Bean(name="puma")
//	Shoes getAPumaShoe(){
//		return new Puma();
//	}
	
	
//	@Bean
//	ShoeCompany getAShoeCompany(){
//		return new ShoeCompany(null);
//	}

}
