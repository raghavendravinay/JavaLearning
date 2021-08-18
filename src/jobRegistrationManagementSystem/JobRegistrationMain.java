package jobRegistrationManagementSystem;

import java.util.ArrayList;

public class JobRegistrationMain {

	public static void main(String[] args) {
		
		ArrayList<Languages> languages = new ArrayList<Languages>();
		Languages java = new Languages("Java");
		Languages python = new Languages("Python");
		languages.add(java);
		languages.add(python);
		
		JobRole qaEngineer = new JobRole(1, "QA Engineer");
		JobRole developer = new JobRole(2,  "Developer");
		JobRole Manager = new JobRole(3, "manager");
		
		JobRegistrationBuilder jrb = new JobRegistrationBuilder();
		JobRegistration jr = new JobRegistration("Vinay", qaEngineer, "BTech", 3, languages, "Tanuku", 9685749685l);
		jrb.addApplicantDetails(jr);
		JobRegistration jr2 = new JobRegistration("Ravi", developer, "BTech", 4, languages, "Hyderabad", 9638527412l);
		jrb.addApplicantDetails(jr2);
		JobRegistration jr3 = new JobRegistration("Vinay", Manager, "BTech", 2, languages, "Tanuku", 9685749685l);
		jrb.addApplicantDetails(jr3);
		JobRegistration jr4 = new JobRegistration("Raghav", Manager, "BTech", 3, languages, "Tanuku", 6898485465l);
		jrb.addApplicantDetails(jr4);
		jrb.printApplicants();
		
		jrb.removeApplicant("Raghav");
		jrb.printApplicants();
		
		System.out.println(jrb.getApplicantDetails("Raghav"));
		System.out.println(jrb.getApplicantDetails("Vinay"));
	}
}
