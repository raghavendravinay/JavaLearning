package oops;

public class JobRegistration {

	String name;
	String jobRole;
	String qualification;
	int exp;
	String languages;
	String address;
	
	public void printRegistrationDetails() {
		System.out.println("Name: " + name + ", JobRole: " + jobRole + ", Qualification: " 
				+ qualification + ", Experience: " + exp + "years, Languages Known: " + languages 
				+ ", Address: " + address);
	}
}
