package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		Operation op = (Operation) ctx.getBean("operationBean"); 
		System.out.println("calling 1st meth displayMsg()...");  
		op.displayMsg("Hello.....");
		
		/*Operation op1 = (Operation) ctx.getBean("operationBean1"); 
		System.out.println("calling displayM()..."+op1.displayM(10));  
        op1.displayM(10);
        
        System.out.println("calling k...");  
        int val = op1.methodK();
        System.out.println("val = "+val);
        
        TargetImplementer ti = (TargetImplementer) ctx.getBean("targerBean1");
        ti.targetMth();*/
	}

}
