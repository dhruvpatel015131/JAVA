package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
	private static ApplicationContext appctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appctx = new ClassPathXmlApplicationContext("appctx.xml");
		OrderDAO od = (OrderDAO)appctx.getBean("orderDAOBean1");

		OrderMst om = (OrderMst)appctx.getBean("orderBean1");
		if(od.saveOrder(om)>0) {
			System.out.println("Record saved successfully.");
		}
		else {
			System.out.println("ERROR!!...Record NOT saved.");
		}
		
		OrderMst selOrd = new OrderMst(1, null, 0.0);
		System.out.println("Order dtls for orderId = " + selOrd.getOrderId() + " are - ");
		System.out.println(od.displayResultSet(selOrd));
		
		System.out.println("List of All Orders - ");
		System.out.println(od.getAllOrders());
		
		System.out.println("Seocnd List of All Orders - ");
		od.getAllOrdersinList();
	}
}