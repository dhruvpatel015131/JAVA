package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	String name;
	String designation;
	String dept;
	
	@Autowired
	public Employee() {
		super();
		this.name = "Ramesh";
		this.designation = "Manager";
		this.dept = "ERP";
	}
	
	@Autowired
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