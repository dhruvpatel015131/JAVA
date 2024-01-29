package in.ac.famt;

import javax.sql.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
	private static ApplicationContext appctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		DataSource ds = (DataSource)appctx.getBean("ds");
		OrderDAO od = (OrderDAO)appctx.getBean("orderDAOBean1");
		
		od.setDataSource(ds);
		OrderMst om = od.getOrder(10);
		System.out.println(om);
		om = od.getOrder(77);
		System.out.println(om);
		om = od.getOrder(3);
		System.out.println(om);
	}
}