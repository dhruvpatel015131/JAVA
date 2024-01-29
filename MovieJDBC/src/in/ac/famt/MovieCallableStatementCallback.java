package in.ac.famt;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;

public class MovieCallableStatementCallback implements CallableStatementCallback<Boolean> {
	int m1;
		
	public MovieCallableStatementCallback(int m1) {
		super();
		this.m1 = m1;
	}

	@Override
	public Boolean doInCallableStatement(CallableStatement cs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		//cs.setInt("mvId", m1.getMovid());
		cs.setInt("mvId", m1);
		cs.registerOutParameter("movCnt", Types.INTEGER);
		cs.execute();

	    boolean hasResults = false;
	    ResultSet rs = cs.getResultSet();
	    while (rs.next()) {
	    	System.out.println("Total movie/s with id = " + m1 + " are - " + rs.getInt(1));
            hasResults = true;
        }
		return hasResults;
	}
}