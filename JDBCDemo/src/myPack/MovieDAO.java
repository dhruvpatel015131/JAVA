package myPack;

import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAO {
	JdbcTemplate  jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveMovie(Movie m1) {
		String str = "INSERT INTO movie VALUES("+m1.getMovieId()+",'"+m1.getTittle()+"','"+m1.getActor()+"')";
		return jdbcTemplate.update(str);
	}
	
}
