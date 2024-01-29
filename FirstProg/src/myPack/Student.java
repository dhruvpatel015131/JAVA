package myPack;

public class Student {
	int rollNo;
	String nm;
	String add;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void printInfo() {
		System.out.println("Student [Roll No=" + rollNo + ", Name=" + nm + ", Address=" + add + "]");
	}
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", nm=" + nm + ", add=" + add + "]";
	}
}
