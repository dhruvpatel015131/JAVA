package secondaryClassCollectionInjection;

import java.util.List;
import java.util.Iterator;

public class Question {
	private int id;
	private String nm;
	private List<Answer> ans;
	
	public Question() {
		super();
	}
	
	public Question(int id, String nm, List<Answer> ans) {
		super();
		this.id = id;
		this.nm = nm;
		this.ans = ans;
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
	
	public List<Answer> getAns() {
		return ans;
	}
	
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", nm=" + nm + ", \n  ans=" + ans + "]";
	}
	
	public void displayInfo() {
		System.out.println("Question is -  " + id + " " + nm );
		Iterator<Answer> itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}