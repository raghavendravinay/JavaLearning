package oops2;

public class JobRegistration {

	private String jobRole;
	private String name;
	private String qualification;
	private int exp;
	private String languages;
	private String address;

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
