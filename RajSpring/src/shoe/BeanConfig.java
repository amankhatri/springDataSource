package shoe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("shoe")
public class BeanConfig {

	@Bean(name="s2")
	Shoe createShoe(){
		System.out.println("Create Shoe");
		return new Rebook(100);
	}
	
	@Bean(name="s1")
	@Scope("prototype")
	Shoe create1Shoe(){
		System.out.println("Create 1 Shoe");
		return new Rebook(200);
	}
}
