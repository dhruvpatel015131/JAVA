package myPack;
import java.util.*;
public class Question {
	private int id;
	private String nm;
	private List<String> ans;
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
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", nm=" + nm + ", ans=" + ans + "]";
	}
	
	

}
