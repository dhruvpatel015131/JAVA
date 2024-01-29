package in.ac.famt;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class MoviePreparedStatementCallback implements PreparedStatementCallback<Boolean> {
	Movies movObj;
	
	public MoviePreparedStatementCallback(Movies movObj) {
		this.movObj = movObj;
	}
	
	@Override
	public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		ps.setInt(1, movObj.getMovid());
		ps.setString(2, movObj.getTitle());
		ps.setString(3, movObj.getActor());
		Boolean bVal = ps.execute();
		if(ps.getUpdateCount() == 1) {
			//System.out.println("Data inserted sucessfully...");
			return true;
		}
		else {
			//System.out.println("Error.....");
			return false;
		}
	}
}
