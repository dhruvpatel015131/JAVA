package in.ac.famt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MovieResultSetExtractor implements ResultSetExtractor<List<Movies>> {

	@Override
	public List<Movies> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		List<Movies> movLst = new ArrayList<Movies>();
		while(rs.next()) {
			int movId = rs.getInt(1);
			String movTitle = rs.getString(2);
			String movActor = rs.getString(3);
			
			Movies movObj = new Movies(movId, movTitle, movActor);
			movLst.add(movObj);
		}
		return movLst;
	}

}
