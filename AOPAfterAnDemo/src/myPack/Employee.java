package myPack;

public class Employee {
	String name;
	String designation;
	String dept;
	
	public Employee() {
		super();
	}

	public Employee(String name, String designation, String dept) {
		super();
		this.name = name;
		this.designation = designation;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", dept=" + dept + "]";
	}
}