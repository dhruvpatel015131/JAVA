package in.ac.famt;

/*
CREATE DEFINER=`root`@`localhost` PROCEDURE 'getOrderDtls' (OUT 'out_supnm' VARCHAR, OUT 'out_ordamt' DOUBLE)
NOT DETERMINISTIC CONTAINS SQL SQL SECURITY DEFINER
BEGIN
	SELECT supplierNm AS out_supnm, orderAmt AS out_ordamt FROM OrderMst WHERE orderId = in_ordid;
END
 */
import java.sql.Types;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class OrderProc extends StoredProcedure {
	
	public OrderProc(DataSource dataSource, String procNm) {
		super(dataSource,procNm);
	    
	    SqlParameter in_ordid = new SqlParameter("in_ordid", Types.INTEGER);
	    SqlOutParameter out_supnm = new SqlOutParameter("out_supnm", Types.VARCHAR);
	    SqlOutParameter out_ordamt = new SqlOutParameter("out_ordamt", Types.DOUBLE);
		
	    SqlParameter[] paramArray = {in_ordid, out_supnm, out_ordamt};
		super.setParameters(paramArray);
	    
	    compile();
	}
	
	public void executeProc(Integer id){
		Map<String, Object> outP = super.execute(id);
		System.out.println(outP);
		
		//creating object for printing same output
		/*
	    OrderMst ordM = new OrderMst();
	    ordM.setOrderId(id);
	    ordM.setSupplierNm((String) outP.get("out_supnm"));
	    if(outP.get("out_ordamt")==null)
	    	ordM.setOrderAmt(0.0);
	    else
	    	ordM.setOrderAmt((Double) outP.get("out_ordamt"));
	    return ordM;	*/
	}
}