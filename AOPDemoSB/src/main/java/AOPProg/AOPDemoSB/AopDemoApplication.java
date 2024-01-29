package AOPProg.AOPDemoSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@EnableAspectJAutoProxy
@Configuration
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
		
		System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AopDemoApplication.class);
        ctx.register(Student.class);

        Student studObj = (Student) ctx.getBean(Student.class);
        System.out.println("Student info is as follows - \n" + studObj);
        
        System.out.println("Total marks of the student - " + studObj.getTotalMarks());
        
        System.out.println("Hence grade is " + studObj.getGrades());
        
        System.out.println("And AddOn courses completed are - " + studObj.getCourses());
        
        ctx.close();
	}
}