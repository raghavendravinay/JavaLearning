package oops2;

public class Employee {

	private String employeeName;
	private int exp;
	private int id;
	private String designation;

	public Employee() {

	}

	public Employee(String employeeName, int exp, int id, String designation) {
		this.employeeName = employeeName;
		this.exp = exp;
		this.id = id;
		this.designation = designation;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getExperience() {
		return exp;
	}

	public int getID() {
		return id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public void setExperience(int exp) {
		this.exp = exp;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String toString() {
		return "Employee Name: " + employeeName + ", Experience: " + exp + ", ID: " + id + ", Designation: "
				+ designation;
	}
}
