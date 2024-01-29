package in.ac.famt;

public class B {
	A a;
	
	public B() {
		super();
	}
	
    public B(A a) {
        super();
        this.a = a;
    }
 
    public A getA() {
        return a;
    }
 
    public void setA(A a) {
        this.a = a;
    }
}