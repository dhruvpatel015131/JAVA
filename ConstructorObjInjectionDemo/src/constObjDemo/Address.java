package constObjDemo;

public class Address {
	int buildingNo;
	String street;
	String dist;
	long pin;
	
	public Address() {
		super();
		this.buildingNo = 0;
		this.street = "";
		this.dist = "";
		this.pin = 0;
	}
	
	public Address(int buildingNo, String street, String dist, int pin) {
		super();
		this.buildingNo = buildingNo;
		this.street = street;
		this.dist = dist;
		this.pin = pin;
	}
	
	public int getBuildingNo() {
		return buildingNo;
	}

	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [buildingNo=" + buildingNo + ", street=" + street + ", dist=" + dist + ", pin=" + pin + "]";
	}
}