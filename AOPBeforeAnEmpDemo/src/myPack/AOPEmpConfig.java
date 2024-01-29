package myPack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class AOPEmpConfig {
	/*
	@Pointcut("execution(* EmployeeOperations.calcSalary(..))")  
    public void pointCutConfig() { 
		
	}
	
	@Before("pointCutConfig()")//applying pointcut on before advice 
    public void increaseSal(JoinPoint jp) {//it is advice (before advice)
        System.out.println("additional concern - Salary Calculation");  
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
	*/
	@Before("execution(* EmployeeOperations.calcSalary(..))")
    public void myadvice(JoinPoint jp) {//it is advice (before advice)
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }
    
}