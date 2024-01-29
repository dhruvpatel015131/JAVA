package in.ac.famt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("Appctx.xml");
		MovieDAOSelect m1 = (MovieDAOSelect)appCon.getBean("movieBean1");

		Movies mo1 = new Movies(4, "XYZ4", "smallCaps4");
		
		int noOfRowsAffected = m1.saveMovie(mo1);
		if(noOfRowsAffected != 0)
			System.out.println("Movie data inserted....");
		else
			System.out.println("Error.....");
		
		System.out.println("Movies in list - ");
		m1.getAllMoviesinList();
		
		System.out.println("List of movies - One record at a time -");
		m1.getSingleRecordOfMovie();
		
		System.out.println("\n\nSingle record of movie - " + m1.getSingleRecordUsingMapper());
		
		m1.countRecords();
		m1.getParameterisedRecord(2);
		
		System.out.println("Details of all Movies - ");
		System.out.println(m1.getAllMoviesUsingResultSetExtractor());
		
		m1.printMovieName();
		m1.getActorOfMovie();
		m1.getMoviesOfActor();
		
		appCon.close();
	}
}