package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {
	private static ApplicationContext appCtx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appCtx =new ClassPathXmlApplicationContext("AppCont.xml");
		MovieDAO m1=(MovieDAO)appCtx.getBean("movieBean1");
		Movie mo1 = new Movie();
		mo1.setMovieId(5);
		mo1.setTittle("ABC");
		mo1.setActor("PQR");
		int noOfRowsAffected = m1.saveMovie(mo1);
		if(noOfRowsAffected !=0)
		{
			System.out.println("Movie Data Inserted");
		}
		else
		{
			System.out.println("Error!!!");
		}
	}

}
