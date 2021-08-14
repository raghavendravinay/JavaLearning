package oops2;

public class JobRegistrationClass {

	public static void main(String[] args) {

		JobRegistrationBuilder jrb = new JobRegistrationBuilder();
		JobRegistration jr = new JobRegistration("Vinay", "Software Tester", "BTech", 2, "Java", "Tanuku");
		jrb.addApplicantDetails(jr);
		JobRegistration jr2 = new JobRegistration("Raghav", "Software Engineer", "BTech", 1, "Java, c#", "Hyderabad");
		jrb.addApplicantDetails(jr2);
		JobRegistration jr3 = new JobRegistration("Ravi", "HR", "MBA", 4, "Not Applicable", "Banglore");
		jrb.addApplicantDetails(jr3);
		JobRegistration jr4 = new JobRegistration("Vinay", "Software Tester", "BTech", 2, "Java", "Tanuku");
		jrb.addApplicantDetails(jr4);
		jrb.printApplicants();
		
		jrb.removeApplicant("Ravi");
		jrb.printApplicants();
		
		System.out.println(jrb.getApplicantDetails("Ravi"));
		System.out.println(jrb.getApplicantDetails("Vinay"));
//		System.out.println(jr);
//		JobRegistration jr2 = new JobRegistration("Raghavendra", "Java Developer", "BTech", 3, "Java, Python",
//				"Hyderabad");
//		System.out.println(jr2);
//		JobRegistration jr3 = new JobRegistration();
//		jr3.setName("Raghav");
//		jr3.setJobRole("Java Developer");
//		jr3.setQualification("BTech");
//		jr3.setExperience(4);
//		jr3.setLanguages(".net");
//		jr3.setAddress("Banglore");
//		System.out.println(jr3);
//
//		JobRegistration jr4 = new JobRegistration();
//		jr4.setName("Raghav");
//		jr4.setJobRole("Java Developer");
//		jr4.setQualification("BTech");
//		jr4.setExperience(4);
//		jr4.setLanguages(".net");
//		jr4.setAddress("Banglore");
//		System.out.println("Applicant Name: " + jr4.getName() + ", Position for applying: " + jr4.getJobRole()
//				+ ", Qualification: " + jr4.getQualification() + ", Experience: " + jr4.getExperience()
//				+ ", Languages known: " + jr4.getLanguages() + ", Address: " + jr4.getAddress());

	}
}
