package inheritanceInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {
	private static ApplicationContext appCon;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appCon = new ClassPathXmlApplicationContext("appctx.xml"); 
		ShapeManager factory=(ShapeManager)appCon.getBean("shapeBean1"); 
		factory.show();
	}
}