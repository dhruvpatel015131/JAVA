package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {
	@Autowired
	public EmployeeOperations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calcSalary(double salary) {
		System.out.println("Inside salary calculation method.");
		return salary + (salary*0.8);
	}
	
	public String printDtls(Employee emp, double salary) {
		return "Employee [name=" + emp.name + ", designation=" + emp.designation + ", "
				+ "dept=" + emp.dept + ", salary = " + salary + "]";
	}
}