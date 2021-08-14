package oops2;

public class CoachingClass {

	public static void main(String[] args) {

		CoachingCenterBuilder ccb = new CoachingCenterBuilder();
		CoachingCenter cc = new CoachingCenter("Vinay", "Java", "Tanuku");
		ccb.registerStudent(cc);
		CoachingCenter cc1 = new CoachingCenter("Ravi", "Python", "Hyderabad");
		ccb.registerStudent(cc1);
		CoachingCenter cc2 = new CoachingCenter("Raghav", "c#", "Tanuku");
		ccb.registerStudent(cc2);
		ccb.printStudents();
		CoachingCenter cc3 = new CoachingCenter("Raghav", "c#", "Tanuku");
		ccb.registerStudent(cc3);
		ccb.printStudents();
		System.out.println(ccb.removeStudent("Raghav"));
		ccb.printStudents();
		System.out.println(ccb.removeStudent("Raghav"));
		ccb.printStudents();
		System.out.println(ccb.getStudents("Ravi"));
		System.out.println(ccb.getStudents("Raghav"));
	}
}
