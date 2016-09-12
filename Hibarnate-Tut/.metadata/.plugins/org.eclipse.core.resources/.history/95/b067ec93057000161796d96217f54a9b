package Day2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	Employee getEmp(){
		System.out.println("creating business bean");
		return new Employee("Awi",1000,"engineer");
	}
	
//	@Bean
//	EmployeeAspect getEmpAspect(){
//		System.out.println("creating aspect bean");
//		return new EmployeeAspect();
//	}

}
