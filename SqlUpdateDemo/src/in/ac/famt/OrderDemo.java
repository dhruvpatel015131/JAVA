package in.ac.famt;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDemo {
	private static ApplicationContext appctx;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appctx = new ClassPathXmlApplicationContext("appctx.xml");
		OrderDAO od = (OrderDAO)appctx.getBean("orderDAOBean1");

		DataSource ds = (DataSource)appctx.getBean("ds");
		
		od.setDataSource(ds);
		od.update(10, 66666.80);
		od.update(77, 454545.50);
		od.update(2, 88811.0);
	}
}