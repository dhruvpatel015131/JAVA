package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class AOPEmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee emp = (Employee) context.getBean("employee");
		EmployeeOperations empOp = (EmployeeOperations) context.getBean("employeeOperations");  
				
		System.out.println("calling CalcSalry method...");
        double newSal = empOp.calcSalary(50000.00);
        System.out.println("New Salary = " + newSal);
        System.out.println("Employee Dtls - " + empOp.printDtls(emp,newSal));
        
        System.out.println("calling Holiday calculation method...");
        int holiday = empOp.calcHoliday(newSal);
        System.out.println("Total Holidays = " + holiday);
        
        context.close();
	}
}