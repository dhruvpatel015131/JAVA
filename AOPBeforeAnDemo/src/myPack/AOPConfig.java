package myPack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;  
import org.aspectj.lang.annotation.Before;  
import org.aspectj.lang.annotation.Pointcut;  

@Aspect  
public class AOPConfig {
	@Pointcut("execution(* Operation.display*(..))")  
    public void pointcutMeth() { 
		  //
	}
      
    @Before("pointcutMeth()")//applying pointcut on before advice  
    public void myadvice(JoinPoint jp) {//it is advice (before advice)
        System.out.println("additional concern");  
        //System.out.println("Method Signature: "  + jp.getSignature());  
    }
    
    @Before("pointcutMeth() || execution(* Operation.print*(..))")
    public void combineExpression() {
    	System.out.println("additional concern with combine expression");
    }
    
    @AfterThrowing(value="execution(* Operation.print*(..))", throwing = "err")
    public void afterThrowingAdvice(JoinPoint jp, Throwable err){
       System.out.println("Method Signature: "  + jp.getSignature());  
       System.out.println("Exception: "+err);  
    }
}