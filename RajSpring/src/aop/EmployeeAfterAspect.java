package aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
	
	
	@After("args(namey)")
    public void logStringArguments(String namey){
        System.out.println("Running After Advice. String argument passed="+namey);
    }
     
//    @AfterThrowing("within(ann.Employee)")
//    public void logExceptions(JoinPoint joinPoint){
//        System.out.println("Exception thrown in Employee Method="+joinPoint.toString());
//    }
     
    @AfterReturning(pointcut="execution(* getName())", returning="returnString")
    public void getNameReturningAdvice(String returnString){
        System.out.println("getNameReturningAdvice executed. Returned String="+returnString);
    }
     
	

}
