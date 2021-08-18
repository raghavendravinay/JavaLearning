package employeeManagementSystem;

public class Employee {

	private String name;
	private int exp;
	private int id;
	private Designation designation;
	
	public Employee(String name, int exp, int id, Designation designation) {
		this.name = name;
		this.exp = exp;
		this.id = id;
		this.designation = designation;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setExperience(int exp) {
		this.exp = exp;
	}
	public int getExperience() {
		return exp;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDesignation(Designation designation) {
		this.designation = designation;
	}
	public Designation getDesignation() {
		return designation;
	}
	
	public String toString() {
		return "Employee [Employee name = " + name + ", Id = " + id + ", Experience = " + exp + ", Designation = " + designation + "]";
	}
	
}
