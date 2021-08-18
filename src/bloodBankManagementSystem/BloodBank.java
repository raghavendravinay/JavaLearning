package bloodBankManagementSystem;

public class BloodBank {

	private String name;
	private BloodGroup bloodGroup;
	private long number;
	private String address;

	public BloodBank(String name, BloodGroup bloodGroup, long number, String address) {
		super();
		this.name = name;
		this.bloodGroup = bloodGroup;
		this.number = number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BloodGroup getGroup() {
		return bloodGroup;
	}

	public void setGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "BloodBank [name = " + name + ", Blood Group " + bloodGroup + ", number = " + number + ", address = " + address
				+ "]";
	}

}
