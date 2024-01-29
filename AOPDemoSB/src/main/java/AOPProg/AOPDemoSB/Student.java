package AOPProg.AOPDemoSB;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
@Component
public class Student {
	@Value("7")
	private int rollNo;
	@Value("Aadesh")
	private String nm;
	@Value("55")
	private int marks1;
	@Value("50")
	private int marks2;
	@Value("60")
	private int marks3;
	@Value("Spring Framework")
	String course1;
	@Value("Spring JDBC")
	String course2;
	
	@Bean(name = "totalMarks")
	public int getTotalMarks() {
		return marks1+marks2+marks3;
		
	}
	
	@Bean(name = "getGrades")
	public String getGrades() {
		if(getTotalMarks()>50)
			return "A Grade";
		else
			return "B Grade";
	}
	
	@Bean(name = "getCourses")
	public String getCourses() {
		return course1 + " and " + course2;
	}

	@Override
	public String toString() {
		String studInfo;
		
		studInfo = "Roll No - " + rollNo + "\nName of Student - " +  nm +
				 "\nMarks in 3 courses - " + marks1 + ", " + marks2 + ", " + marks3 +
				 "\nAddOn courses are - " + course1 + " and " + course2;
		
		return studInfo;
	}
}