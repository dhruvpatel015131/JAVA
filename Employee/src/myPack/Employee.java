package myPack;

public class Employee {
	int id;
	String name;
	Address addr;
	public Employee() {
		super();
	}
	public Employee(int id, String name, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
