package constObjDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorObjInjectionDemo {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee e1=(Employee)ctx.getBean("empBean");
		System.out.println(e1);
		
		Address a1 = (Address)ctx.getBean("addrBean");
		a1.setBuildingNo(505);
		System.out.println(e1);
	}
}