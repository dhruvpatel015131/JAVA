package myPack;

public class Movie {
	private int movieId;
	private String tittle;
	private String actor;
	public Movie() {
		super();
	}
	public Movie(int movieId, String tittle, String actor) {
		super();
		this.movieId = movieId;
		this.tittle = tittle;
		this.actor = actor;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", tittle=" + tittle + ", actor=" + actor + "]";
	}
	
}
