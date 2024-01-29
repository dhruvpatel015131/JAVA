package in.ac.famt;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AOPClass {
	//@Before("within(in.ac.famt.*)")//S50
	//@Before("execution(public void Operation.*(..))")//S48
	//@AfterReturning("execution(public int Operation.*(..))")
	//@Before("args(java.lang.String)")
	@After("args(java.lang.String)")
    public void doSmthing(JoinPoint jp) {
		System.out.println("Inside d AOPClass......1");
		String packageName = jp.getSignature().getDeclaringTypeName();
	    String methodName = jp.getSignature().getName();
	    System.out.println("Exiting method [" + packageName + "." + methodName + "]; ");
	}
	
	@AfterReturning("bean(operationBean1)")
	public void callMe(JoinPoint jp) {
		System.out.println("Inside d AOPClass......2");
		String packageName = jp.getSignature().getDeclaringTypeName();
	    String methodName = jp.getSignature().getName();
	    System.out.println("Exiting method [" + packageName + "." + methodName + "]; ");
	}
	
	@Before("target(in.ac.famt.TargetInf)")
	public void targetCall(JoinPoint jp) {
		System.out.println("Calling interface method......");
		String packageName = jp.getSignature().getDeclaringTypeName();
	    String methodName = jp.getSignature().getName();
	    System.out.println("Exiting method [" + packageName + "." + methodName + "]; ");
	}
}
