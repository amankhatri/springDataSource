package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectBefore {
	
	@Before("execution(public String get*())")
	public void func(){
		System.out.println("Entering Function ....");
	}
	
	@After("execution(public String get*())")
	public void func1(){
		System.out.println("...Exiting Function");
	}
	
	@AfterReturning("execution(public String get*())")
	public void func2(){
		System.out.println("...After returning Exiting Function");
	}
	
//	@Before("execution(public String getMoreName())")
//	public void func1(){
//		System.out.println("Before More Advice");
//	}
	
	@Before("args(name))")
	public void func3(String name){
		System.out.println("Entering Function ...." + name);
	}
	


}
