package myPack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import java.util.logging.Logger;

@Aspect 
public class AOPEmpConfig {
	Logger log = Logger.getLogger("");

	@Pointcut("execution(* EmployeeOperations.calcSalary (..))")  
    public void pointCutConfig1() { 
		
	}
	
	@After("pointCutConfig1()")//applying pointcut on before advice 
    public void logForSalCal(JoinPoint jp) {//it is advice (before advice)
        //System.out.println("additional concern - After Salary Calculation");
        log.info("additional concern - After Salary Calculation");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
	
	@Pointcut("execution(* EmployeeOperations.calcHoliday (..))")  
    public void pointCutConfig2() { 
		
	}
	@After("pointCutConfig2()")//applying pointcut on before advice 
    public void printMsg(JoinPoint jp) {//it is advice (before advice)
        //System.out.println("additional concern - from CalcHoliday()");  
        log.info("additional concern - from CalcHoliday()");
        //System.out.println("Method Signature: "  + jp.getSignature());
    }
}