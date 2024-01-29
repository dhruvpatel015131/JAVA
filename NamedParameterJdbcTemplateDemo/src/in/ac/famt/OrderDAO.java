package in.ac.famt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class OrderDAO {
	NamedParameterJdbcTemplate template;

	public NamedParameterJdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(NamedParameterJdbcTemplate template) {
		this.template = template;
	}
	
	public int saveOrder(OrderMst om) {
		String sqlStr = "INSERT INTO orderMst VALUES(:orderId, :supplierNm, :orderAmt)";	
		
		/*Map<String, Object> params = new HashMap<String, Object>();
		params.put("orderId", om.getOrderId());
		params.put("supplierNm", om.getSupplierNm());
		params.put("orderAmt", om.getOrderAmt());*/
		
		/*MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("orderId", om.getOrderId());
		params.addValue("supplierNm", om.getSupplierNm());
		params.addValue("orderAmt", om.getOrderAmt());*/
		
		SqlParameterSource params = new BeanPropertySqlParameterSource(om);
		
		return template.update(sqlStr, params);
	}
	
	public OrderMst displayResultSet(OrderMst selOrd) {
		String sqlStr = "SELECT * FROM orderMst WHERE orderId = :orderId";
		SqlParameterSource params = new BeanPropertySqlParameterSource(selOrd);
		OrderMst ordDtls = template.queryForObject(sqlStr, params, 
							new BeanPropertyRowMapper<OrderMst>(OrderMst.class));
		return ordDtls;
		
		/*OrderMst ordDtls = template.queryForObject(sqlStr, params, 
					new BeanPropertyRowMapper<OrderMst>() {	
			
			@Override
			public OrderMst mapRow(ResultSet arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			OrderMst ordObj = new OrderMst();
			ordObj.setOrderId(arg0.getInt("orderId"));
			ordObj.setSupplierNm(arg0.getString("supplierNm"));
			ordObj.setOrderAmt(arg0.getDouble("orderAmt"));
			return ordObj;
		}
	});
		return ordDtls;*/
	}
	
	public List<OrderMst> getAllOrders() {
		String sqlStr = "SELECT * FROM orderMst";
		return template.query(sqlStr, new OrderResultSetExtractor());
		
		/*return template.query(sqlStr, new ResultSetExtractor<List<OrderMst>>() {

			@Override
			public List<OrderMst> extractData(ResultSet arg0) 
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				List<OrderMst> ordList = new ArrayList<OrderMst>();
				while(arg0.next()) {
					OrderMst ordObj = new OrderMst();
					ordObj.setOrderId(arg0.getInt(1));
					ordObj.setSupplierNm(arg0.getString(2));
					ordObj.setOrderAmt(arg0.getDouble(3));
					
					ordList.add(ordObj);
				}
				return ordList;
			}	
		});*/
	}
	
	public void getAllOrdersinList() {
		String sqlStr = "SELECT * FROM orderMst";
		System.out.println(template.queryForList(sqlStr, new HashMap<String, Object>()));
	}
}