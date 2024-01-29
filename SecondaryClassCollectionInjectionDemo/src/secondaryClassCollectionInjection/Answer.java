package secondaryClassCollectionInjection;

public class Answer {
	private int id;
	private String nm;
	private String by;
	
	public Answer() {
		super();
	}

	public Answer(int id, String nm, String by) {
		super();
		this.id = id;
		this.nm = nm;
		this.by = by;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", nm=" + nm + ", by=" + by + "]";
	}
}
