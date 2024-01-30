package myPack;

public class AccountDemo {
	int acntNo;
	String acntNm;
	double acntBal;
	
	



	public AccountDemo() {
		super();
	}





	public AccountDemo(int acntNo, String acntNm, double acntBal) {
		super();
		this.acntNo = acntNo;
		this.acntNm = acntNm;
		this.acntBal = acntBal;
	}





	@Override
	public String toString() {
		return "AccountDemo [acntNo=" + acntNo + ", acntNm=" + acntNm + ", acntBal=" + acntBal + "]";
	}
	
}
