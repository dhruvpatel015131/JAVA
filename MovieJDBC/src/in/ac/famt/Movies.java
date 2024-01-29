package in.ac.famt;

public class Movies {
	//Table Nm - myMovies
	private int movid;
	private String title;
	private String actor;
		
	Movies() {
		super();
	}

	Movies(int movid, String title, String actor) {
		super();
		this.movid = movid;
		this.title = title;
		this.actor = actor;
	}
	
	public int getMovid() {
		return movid;
	}
	
	public void setMovid(int movid) {
		this.movid = movid;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getActor() {
		return actor;
	}
	
	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Movies [movid=" + movid + ", title=" + title + ", actor=" + actor + "]";
	}
	
}