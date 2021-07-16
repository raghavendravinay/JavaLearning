package oops2;

public class Employee {

	private String EmployeeName;
	private int exp;
	private int id;
	private String designation;

	public Employee(String EmployeeName, int exp, int id, String designation) {
		this.EmployeeName = EmployeeName;
		this.exp = exp;
		this.id = id;
		this.designation = designation;
	}

	public String toString() {
		return "Employee Name: " + EmployeeName + ", Experience: " + exp + ", ID: " + id + ", Designation: "
				+ designation;
	}
}
