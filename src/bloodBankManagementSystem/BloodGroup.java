package bloodBankManagementSystem;

public class BloodGroup {

	private int id;
	private String bloodGroup;

	public BloodGroup(int id, String bloodGroup) {
		this.id = id;
		this.bloodGroup = bloodGroup;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "[id = " + id + ", bloodGroup =" + bloodGroup + "]";
	}

}
