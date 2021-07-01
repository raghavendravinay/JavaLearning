package oops;

public class JobRegistrationClass {

	public static void main(String[] args) {
		
		JobRegistration jR = new JobRegistration();
		jR.name = "Vinay";
		jR.jobRole = "Automation Testing Engineer";
		jR.qualification = "BTech";
		jR.exp = 5;
		jR.languages = "Java";
		jR.address = "Tanuku";
		jR.printRegistrationDetails();
		
		JobRegistration jr2 = new JobRegistration();
		jr2.name = "Raghavendra";
		jr2.jobRole = "Automation Testing Engineer";
		jr2.qualification = "BTech";
		jr2.exp = 3;
		jr2.languages = "Java";
		jr2.address = "Tanuku";
		jr2.printRegistrationDetails();
		
	}
}
