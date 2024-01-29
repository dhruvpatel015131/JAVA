package in.ac.famt;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationBean.class);

        User user = applicationContext.getBean("user",User.class);
        System.out.println(user);

        applicationContext.close();

	}
}