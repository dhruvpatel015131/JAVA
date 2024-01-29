package in.ac.famt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBean {
	User user;
	@Bean(name="user")
	public User getUser() {
	   //User user=new User();
	  // user.setId(10);
	  // user.setName("test");
	   return user;
	}
}
