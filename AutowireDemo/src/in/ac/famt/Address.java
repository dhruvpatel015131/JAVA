package in.ac.famt;

public class Address {
	int buildingNo;
	String street;
	String dist;
	long pin;

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