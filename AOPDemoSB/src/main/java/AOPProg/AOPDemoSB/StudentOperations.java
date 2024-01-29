package AOPProg.AOPDemoSB;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@Aspect
public class StudentOperations {
	
	/*@Pointcut("execution(* Student.*(..))")
	public void printMsg() {
		System.out.println("Operating on Student class...");
	}*/
	
	//@Before("within(HelloAOP.*)")//S50
	//@Before("execution(public String Student.*(..))")//S48
	//@AfterReturning("execution(public int Operation.*(..))")
	//@Before("args(java.lang.String)")
	/*public void doSmthing(JoinPoint jp) {
		System.out.println("Inside d AOPClass......1");
		String packageName = jp.getSignature().getDeclaringTypeName();
	    String methodName = jp.getSignature().getName();
	    System.out.println("Exiting method [" + packageName + "." + methodName + "]; ");
	}*/
	
	//@AfterReturning("execution(* AOPProg.AOPDemoSB.*.*(..))")
	@Before("execution(* AOPProg.AOPDemoSB.*.*(..))")
	//@Pointcut("execution(* AOPProg.AOPDemoSB.*.*(..))")
	public void printMsg() {
		System.out.println("Operating on Student class...");
	}
}