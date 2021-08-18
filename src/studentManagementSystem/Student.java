package studentManagementSystem;

public class Student {

	private int id;
	private String name;
	private Branch branch;

	public Student(int id, String name, Branch branch) {
		this.id = id;
		this.name = name;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String toString() {
		return "Student [id= " + id + ", name= " + name + ", branch= " + branch + "]";
	}

}
