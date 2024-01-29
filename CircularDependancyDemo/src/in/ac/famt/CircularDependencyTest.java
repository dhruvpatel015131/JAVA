package in.ac.famt;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("appctx.xml");
        A a = (A) ac.getBean("a");
        a.doSomeThing();
        ac.close();
	}
}