package myPack;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class AOPBeforeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        Operation e = (Operation) context.getBean("opBean");  
        System.out.println("calling msg...");
        e.displayMsg();  
        System.out.println("-------------");
        System.out.println("calling displayM..." + e.displayM());
        System.out.println("-------------");
        System.out.println("calling methodK..." + e.methodK()); 
	}
}