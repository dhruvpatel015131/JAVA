package myPack;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class AOPEmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		EmployeeOperations empOp = (EmployeeOperations) context.getBean("employeeOperations");  
				
		System.out.println("calling CalcSalry method...");
        double newSal = empOp.calcSalary(1000.00);
        System.out.println("New Salary = " + newSal);
        System.out.println("Net Salary is " + empOp.printDtls(emp,newSal));
	}
}