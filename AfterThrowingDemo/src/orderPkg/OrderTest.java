package orderPkg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		Order ord = (Order) ctx.getBean("orderBean"); 
		System.out.println("Dtls of Order - " + ord);
		try {
			System.out.println("Trying to update order qty to -1");
			ord.setOrderQty(-1);
		}
		catch(Exception e) {
			//
		}
		ctx.close();
	}

}
