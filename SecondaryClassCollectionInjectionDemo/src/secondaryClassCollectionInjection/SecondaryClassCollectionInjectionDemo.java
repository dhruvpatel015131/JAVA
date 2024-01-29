package secondaryClassCollectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SecondaryClassCollectionInjectionDemo {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("AppContext.xml");
		Question q1=(Question)ctx.getBean("queBean1");
		System.out.println(" " + q1);
		
		Question q2=(Question)ctx.getBean("queBean2");
		System.out.println(" " + q2);
	}
}