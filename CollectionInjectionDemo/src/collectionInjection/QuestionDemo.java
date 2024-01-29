package collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionDemo {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx=new ClassPathXmlApplicationContext("CollectionConfig.xml");
		Question q1 = (Question)ctx.getBean("queBean");
		q1.displayInfo();
		System.out.println(q1);
	}
}