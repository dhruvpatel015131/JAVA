package in.ac.famt;

public class Person {
	String name;
    String address;
    int age;
    
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}