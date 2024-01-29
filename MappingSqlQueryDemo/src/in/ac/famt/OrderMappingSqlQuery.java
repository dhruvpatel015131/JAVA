package in.ac.famt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import javax.sql.DataSource;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;

public class OrderMappingSqlQuery extends MappingSqlQuery<OrderMst> {
	public OrderMappingSqlQuery(DataSource ds, String sqlStr) {
        super(ds, sqlStr);
        super.declareParameter(new SqlParameter("orderId", Types.INTEGER));
        compile();
    }
	
	@Override
	protected OrderMst mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		OrderMst om = new OrderMst();
	    om.setOrderId(rs.getInt("orderId"));
	    om.setSupplierNm(rs.getString("supplierNm"));
	    om.setOrderAmt(rs.getDouble("orderAmt"));
		return om;
	}
}