package in.ac.famt;

/*
DROP PROCEDURE `movieLst`; 
CREATE DEFINER=`root`@`localhost` PROCEDURE `movieLst`(OUT `movCnt` INT, IN `mvId` INT) 
	NOT DETERMINISTIC CONTAINS SQL SQL SECURITY DEFINER 
		BEGIN 
			SELECT COUNT(movid) AS movCnt FROM mymovies WHERE movid = mvId; 
		END
 
 * */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

public class MovieDAOOther {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public Boolean saveMoviePs(Movies m1) {
		//Executing prepared stmt
		String sqlStr = "INSERT INTO myMovies VALUES(?, ?, ?)";
		return jdbcTemplate.execute(sqlStr, new MoviePreparedStatementCallback(m1));
	}
	
	public void callCountProcedure(int m1) {
		String callStr = "{call moviedb.movieLst(?, ?)}";
		jdbcTemplate.execute(callStr, new MovieCallableStatementCallback(m1));
		/*jdbcTemplate.execute(callStr, new CallableStatementCallback<Boolean>(){
			@Override
			public Boolean doInCallableStatement(java.sql.CallableStatement cs) 
					throws SQLException, DataAccessException {
				
				cs.setInt("mvId", m1.getMovid());
				cs.registerOutParameter("movCnt", Types.INTEGER);
				cs.execute();

			    boolean hasResults = false;
			    ResultSet rs = cs.getResultSet();
			    while (rs.next()) {
			    	System.out.println("Total movie/s with id = " + m1.getMovid() + " are - " + rs.getInt(1));
		            hasResults = true;
		        }
				return hasResults;
			}
		});*/
	}
	
	/*
	 * 
	 public Boolean callCountProcedure(Movies m1) {
		String callStr = "{call moviedb.movieLst(?, ?)}";
		return jdbcTemplate.execute(callStr, new CallableStatementCallback<Boolean>(){
			@Override
			public Boolean doInCallableStatement(java.sql.CallableStatement cs) 
					throws SQLException, DataAccessException {
				
				cs.setInt("mvId", m1.getMovid());
				cs.registerOutParameter("movCnt", Types.INTEGER);
				cs.execute();

			    boolean hasResults = false;
			    ResultSet rs = cs.getResultSet();
			    while (rs.next()) {
			    	System.out.println("Total movie/s with id = " + m1.getMovid() + " are - " + rs.getInt(1));
		            hasResults = true;
		        }
				return hasResults;
			}
		});
	}
	 * 
	 * */
}