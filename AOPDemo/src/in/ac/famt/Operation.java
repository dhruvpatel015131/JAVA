package in.ac.famt;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Operation {
	public void displayMsg(String msg) {
		System.out.println("This is a display method invoked...");
		System.out.println("Message is - " + msg);
	}
	
	public int displayM(int n) {
		Logger log = Logger.getLogger("");
		log.log(Level.INFO, "Inside of displayM(int n) method ****");
		System.out.println("This method diplays -> M n return param");
		return 5;
	}
    
	public int methodK() {
		System.out.println("k method invoked n return 3");
		return 3;
	}  
}