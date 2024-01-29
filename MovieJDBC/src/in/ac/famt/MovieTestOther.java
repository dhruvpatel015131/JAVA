package in.ac.famt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MovieTestOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext appCon = new ClassPathXmlApplicationContext("Appctx.xml");
		MovieDAOOther m2 = (MovieDAOOther)appCon.getBean("movieBean2");
		
		Boolean dataSaveFlag = m2.saveMoviePs(new Movies(11, "Mahesh", "Aakhari Sach"));
		if(dataSaveFlag == true) 
			System.out.println("Data inserted sucessfully...");
		else
			System.out.println("Error.....");
		
		m2.callCountProcedure(6);
		
		appCon.close();
	}

}
