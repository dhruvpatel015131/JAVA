package in.ac.famt;

public class Customer {
	Person person;
	Address addr;
    int type;
    String action;
    
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Customer [person=" + person + ", addr=" + addr + ", type=" + type + ", action=" + action + "]";
	}

	public Address getAddress() {
		return addr;
	}

	public void setAddress(Address address) {
		this.addr = address;
	}
}