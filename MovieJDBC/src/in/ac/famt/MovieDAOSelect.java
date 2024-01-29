package in.ac.famt;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class MovieDAOSelect {
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveMovie(Movies m1) {
		String sqlStr = "INSERT INTO myMovies VALUES(" + m1.getMovid() +",'" + m1.getTitle() + "','" + m1.getActor()  + "')";
		//String sql = "INSERT INTO myMovies VALUES("+ m1.getMovid()+",'"+ m1.getTitle()+"','"+ m1.getActor()+"')";
		return jdbcTemplate.update(sqlStr);
	}
	
	public void getAllMoviesinList() {
		String sqlStr = "SELECT * FROM myMovies";
		System.out.println(jdbcTemplate.queryForList(sqlStr));
	}
	
	public void getSingleRecordOfMovie() {
		String sqlStr = "SELECT * FROM myMovies";
		List<Map<String,Object>> movList = jdbcTemplate.queryForList(sqlStr);
		
		/*movList.forEach((movElt) -> 
			{
				int mid = (int)movElt.get("movid");
				String mt = (String)movElt.get("title");
				String act = (String)movElt.get("actor");
				System.out.println("Movie Dtls - " + mid + " " + " " + mt + " " + act.toUpperCase());
			});*/
		
		for(int i=0;i<movList.size();i++) {
			Map<String, Object> movElt = movList.get(i);
			int mid = (int)movElt.get("movid");
			String mt = (String)movElt.get("title");
			String act = (String)movElt.get("actor");
			System.out.println("Movie Dtls - " + mid + " " + " " + mt + " " + act.toUpperCase());		
		}
	}
	
	public Movies getSingleRecordUsingMapper() {
		String sqlStr = "SELECT * FROM myMovies WHERE movid = 2";
		return jdbcTemplate.queryForObject(sqlStr, BeanPropertyRowMapper.newInstance(Movies.class));
	}
	
	public void getParameterisedRecord(int movId) {
		String sqlStr = "SELECT title FROM myMovies WHERE movid = ?";
		String mTitle = jdbcTemplate.queryForObject(sqlStr, String.class, movId);
		System.out.println("Movie with movieId = " + movId + " is - " + mTitle);
	}
	
	public void countRecords() {
		String sqlStr = "SELECT COUNT(*) FROM myMovies";
		int count = jdbcTemplate.queryForObject(sqlStr, Integer.class);
		System.out.println("No of records - " + count);
	}
	
	public List<Movies> getAllMoviesUsingResultSetExtractor() {
		String sqlStr = "SELECT * FROM myMovies";
		return jdbcTemplate.query(sqlStr, new MovieResultSetExtractor());
		/*
		return jdbcTemplate.query(sqlStr, new ResultSetExtractor<List<Movies>>() {

			@Override
			public List<Movies> extractData(ResultSet arg0) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				
				List<Movies> movList = new ArrayList<Movies>();
				while(arg0.next()) {
					Movies movObj = new Movies();
					movObj.setMovid(arg0.getInt(1));
					movObj.setTitle(arg0.getString(2));
					movObj.setActor(arg0.getString(3));
					
					movList.add(movObj);
				}
				return movList;
			}	
		});*/
	}
	
	public void printMovieName() {
		String sqlStr = "SELECT title FROM myMovies where movid = 1";//
		List<String> movNmList = jdbcTemplate.queryForList(sqlStr, String.class);
		System.out.println("Names of Movie/s - " + movNmList);	
	}
	
	public void getActorOfMovie() {
		String actor = "NC";
		String sqlStr = "SELECT title FROM myMovies WHERE actor = ?";
		List<String> movNm = jdbcTemplate.queryForList(sqlStr, String.class, actor);
		System.out.println("Actor " + actor + " played role in Movie - " + movNm);	
	}
	
	public void getMoviesOfActor() {
		String actor = "NC";
		String sqlStr = "SELECT * FROM myMovies WHERE actor = ?";
		List<Map<String,Object>> movRecord = jdbcTemplate.queryForList(sqlStr, actor);
		System.out.println("Details of movie of actor " + actor + " are " + movRecord);
		
		/*List<Map<String,Object>> movList = jdbcTemplate.queryForList(sqlStr,actor);
		List<Movies> movLst = new ArrayList<Movies>();
		movList.forEach((movElt) -> 
			{
				Movies movie = new Movies((int)movElt.get("movid"), 
					(String)movElt.get("title"), (String)movElt.get("actor"));
				movLst.add(movie);
			});
		System.out.println("Details of movie of actor " + actor + " are " + movLst);// return movLst*/
	}
}