package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}