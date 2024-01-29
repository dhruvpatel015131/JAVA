package in.ac.famt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class OrderResultSetExtractor implements ResultSetExtractor<List<OrderMst>> {

	@Override
	public List<OrderMst> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<OrderMst> ordList = new ArrayList<OrderMst>();
		while(rs.next()) {
			int ordId = rs.getInt(1);
			String ordSupplier = rs.getString(2);
			double ordAmt = rs.getDouble(3);
			OrderMst ordObj = new OrderMst(ordId, ordSupplier, ordAmt);
					
			ordList.add(ordObj);
		}
		return ordList;
	}

}
