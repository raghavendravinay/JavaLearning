package jobRegistrationManagementSystem;

public class JobRole {

	private int id;
	private String jobRole;
	public JobRole(int id, String jobRole) {
		super();
		this.id = id;
		this.jobRole = jobRole;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getJobRole() {
		return jobRole;
	}
	
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}
	
	public String toString() {
		return "[id = " + id + ", jobRole = " + jobRole + "]";
	}
	
	
}
