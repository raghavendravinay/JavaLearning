package employeeManagementSystem;

public class Designation {
	
	private String designation;
	private int id;
	
	public Designation(int id, String designation) {
		this.id = id;
		this.designation = designation;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getDesignation() {
		return designation;
	}

	public String toString() {
		return " [Id = " + id + ", Designation = " + designation + "]"; 
	}
}
