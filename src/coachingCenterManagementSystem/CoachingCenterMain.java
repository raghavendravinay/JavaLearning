package coachingCenterManagementSystem;

public class CoachingCenterMain {

	public static void main(String[] args) {
	Course java = new Course(1,  "Java");
	Course python = new Course(2, "Python");
	Course dotNet = new Course(3, ".net");
	Course csharp = new Course(4, "C#");
	CoachingCenterBuilder ccb = new CoachingCenterBuilder();
	
	CoachingCenter cc = new CoachingCenter("Vinay", java, 9898656535l, "Hyderabad");
	ccb.registerStudent(cc);
	CoachingCenter cc2 = new CoachingCenter("Raghav", python, 9685412573l, "Tanuku");
	ccb.registerStudent(cc2);
	CoachingCenter cc3 = new CoachingCenter("Ravi", dotNet, 7845986515l, "Hyderabad");
	ccb.registerStudent(cc3);
	CoachingCenter cc4 = new CoachingCenter("Vinay", csharp, 6598451535l, "Tanuku");
	ccb.registerStudent(cc4);
	ccb.printStudents();
	
	ccb.removeStudent("Ravi");
	ccb.printStudents();
	
	System.out.println(ccb.getStudents("Ravi"));
	System.out.println(ccb.getStudents("Vinay"));
	
	
	}
}
