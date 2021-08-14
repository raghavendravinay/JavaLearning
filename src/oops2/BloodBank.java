package oops2;

public class BloodBank {

	private String name;
	private String bloodGroup;
	private long number;
	private String address;

	public BloodBank(String name, String bloodGroup, long number, String address) {
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.number = number;
		this.address = address;
	}
	public BloodBank() {
		
	}
	public String getName() {
		return name;
	}
	public String getbloodGroup() {
		return bloodGroup;
	}
	public long getNumber() {
		return number;
	}
	public String getAddress() {
		return address;
	}
	public void setDepartment(String name) {
		this.name = name;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Name: " + name + "\nBlood Group" + bloodGroup + "\nNumber:" + number + "\nAddress: " + address + "." ;

	}
}
