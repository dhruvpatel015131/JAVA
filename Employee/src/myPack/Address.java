package myPack;

public class Address {
	int buildingNo;
	String street;
	String city;
	int pincode;
	
	public Address() {
		super();
	}

	public Address(int buildingNo, String street, String city, int pincode) {
		super();
		this.buildingNo = buildingNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return " [buildingNo=" + buildingNo + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}
	
}
