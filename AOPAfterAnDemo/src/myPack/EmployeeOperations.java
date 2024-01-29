package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeOperations {
	@Autowired
	public EmployeeOperations() {
		super();
	}

	public double calcSalary(double salary) {
		System.out.println("Inside salary calculation method....");
		return salary + (salary*0.8);
	}
	
	public int calcHoliday(double salary) {
		System.out.println("Inside Holiday calculation method....");
		return (int)(salary/1000.00) ;
	}
	
	public String printDtls(Employee emp, double salary) {
		return "Employee [name=" + emp.name + ", designation=" + emp.designation + 
				", " + "dept=" + emp.dept + ", salary = " + salary + "]";
	}
}