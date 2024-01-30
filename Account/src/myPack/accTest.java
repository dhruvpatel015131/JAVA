package myPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class accTest {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctx = new ClassPathXmlApplicationContext("acc.xml");
		AccountDemo acObj = (AccountDemo)ctx.getBean("acc");
		System.out.println("Account Number  is - "+acObj.acntNo);
		System.out.println("Account name is- "+acObj.acntNm);
		System.out.println("Account Balance is- "+acObj.acntBal);
	}

}
