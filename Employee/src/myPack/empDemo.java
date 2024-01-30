package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class empDemo {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("emp.xml");
		Employee empObj = (Employee)ctx.getBean("empBean1");
		System.out.println("Employee id is- "+empObj.id);
		System.out.println("Employee Name is- "+empObj.name);
		System.out.println("Employee Address is- "+empObj.addr);
	}

}
