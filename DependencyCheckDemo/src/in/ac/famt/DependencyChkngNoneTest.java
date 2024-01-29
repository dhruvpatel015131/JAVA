package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyChkngNoneTest {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("dependencyChkNone.xml");
		
		Customer c1=(Customer)ctx.getBean("CustomerBean1");
		System.out.println(c1);
		
		Customer c2=(Customer)ctx.getBean("CustomerBean2");
		System.out.println(c2);
	}
}