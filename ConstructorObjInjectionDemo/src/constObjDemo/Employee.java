package constObjDemo;

//Object injection using setter
//Address addr is object of secondary class

public class Employee {
	int empId;
	String empNm;
	Address addr;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String empNm, Address addr) {
		super();
		this.empId = empId;
		this.empNm = empNm;
		this.addr = addr;
	}

	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpNm() {
		return empNm;
	}
	
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
	public Address getAddr() {
		return addr;
	}
	
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empNm=" + empNm + ", addr=" + addr + "]";
	}
}