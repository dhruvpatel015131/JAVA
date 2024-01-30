package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("greet.xml");
		Greeting greetObj = (Greeting)ctx.getBean("greetBean");
		System.out.println("Msg is- "+greetObj);
	}

}
