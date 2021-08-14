package oops2;

public class JobRegistration {

	private String jobRole;
	private String name;
	private String qualification;
	private int exp;
	private String languages;
	private String address;
	
	public JobRegistration() {
		
	}

	public String getJobRole() {
		return jobRole;
	}
	
	public String getName() {
		return name;
	}
	
	public String getQualification() {
		return qualification;
	}
	
	public int getExperience() {
		return exp;
	}
	
	public String getLanguages() {
		return languages;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public void setExperience(int exp) {
		this.exp = exp;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public JobRegistration(String name, String jobRole, String qualification, int exp, String languages, String address) {
		this.name = name;
		this.jobRole = jobRole;
		this.qualification = qualification;
		this.exp = exp;
		this.languages = languages;
		this.address = address;
	}

	public String toString() {
		return "Applicant Name: " + name + ", Position for applying: " + jobRole + ", Qualification: " + qualification
				+ ", Experience: " + exp + ", Languages known: " + languages + ", Address: " + address;
	}
}
