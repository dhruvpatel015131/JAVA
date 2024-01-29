package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudTest {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("StudentConfig.xml");
		Student s1 = (Student)ctx.getBean("stud");
		s1.printInfo();
		Student s2 = (Student)ctx.getBean("stud1");
		System.out.println(s2);
	}
}