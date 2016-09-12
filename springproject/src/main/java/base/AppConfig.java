package base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="Hotel")
	Food genHotel()
	{
		return new Burger();
	}
	
	@Bean(name="RecepieType")
	Recepie genRecepie()
	{
		System.out.println("Recepie");
		return new Recepie("Pizza");
	}
	
	@Bean(name="Recepie")
	Recepie genMoreRecepie()
	{
		System.out.println("Recepie f");
		return new Recepie("Burger");
	}

}
