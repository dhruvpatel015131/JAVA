package in.ac.famt;

import javax.sql.DataSource;

public class OrderDAO {
	DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void getOrder(Integer id) {
		OrderProc ordmap = new OrderProc(dataSource,"getOrderDtls");
		//return ordmap.executeProc(id);
		ordmap.executeProc(id);
	}    
}