package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Appctx.xml");
	    HelloWorld obj = (HelloWorld) ctx.getBean("helloWorldBean1");
	    obj.getMessage();
	}
}