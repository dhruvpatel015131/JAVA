package myPack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Operation {
	@Autowired
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void displayMsg() {
		System.out.println("This is a display method invoked...");
	}
	
	public int displayM() {
		System.out.println("This method diplays -> M n return param");
		return 5;
	}
    
	public int methodK() {
		System.out.println("k method invoked n return 3");
		return 3;
	}
	
	public void printThis() {
		System.out.println("printThis() method invoked n return nothing...");
	}
	
	/*public void printErr() throws ClassNotFoundException {
		System.out.println("Exception raised");
	    //throw new IllegalArgumentException();
		throw new ClassNotFoundException();
	}*/
	
	public void printErr() {
		System.out.println("Exception raised");
	    throw new IllegalArgumentException();
	}
}