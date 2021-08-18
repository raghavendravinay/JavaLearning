package jobRegistrationManagementSystem;

import java.util.ArrayList;

public class JobRegistration {

	private String name;
	private JobRole jobRole;
	private String qualification;
	private int exp;
	private ArrayList<Languages> languages;
	private String address;
	private long number;
	public JobRegistration(String name, JobRole jobRole, String qualification, int exp, ArrayList<Languages> languages, String address,
			long number) {
		this.name = name;
		this.jobRole = jobRole;
		this.qualification = qualification;
		this.exp = exp;
		this.languages = languages;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JobRole getJobRole() {
		return jobRole;
	}

	public void setJobRole(JobRole jobRole) {
		this.jobRole = jobRole;
	}
	
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public ArrayList<Languages> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<Languages> languages) {
		this.languages = languages;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumber() {
		return number;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}
	
	public String toString() {
		return "JobRegistration [name = " + name + ", jobRole " + jobRole + ", qualification = " + qualification + ", exp="
				+ exp + ", languages " + languages + ", address = " + address + ", number = " + number + "]";
	}
	
	
}
