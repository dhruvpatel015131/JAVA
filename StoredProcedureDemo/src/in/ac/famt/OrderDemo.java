package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
	private static ApplicationContext appctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appctx = new ClassPathXmlApplicationContext("appctx.xml");
		OrderDAO od = (OrderDAO)appctx.getBean("orderDAOBean1");
	
		//System.out.println(od.getOrder(10));
		System.out.println("Order dtls are - ");
		od.getOrder(3);
	}
}