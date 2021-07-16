package oops2;

public class CoachingClass {

	public static void main(String[] args) {

		CoachingCenter cc = new CoachingCenter("Vinay", "Java", "Tanuku");
		System.out.println(cc);
		CoachingCenter cc1 = new CoachingCenter();
		cc1.setName("Raghav");
		cc1.setCourse(".net");
		cc1.setAddress("address");
		System.out.println(cc1);
		CoachingCenter cc2 = new CoachingCenter();
		cc2.setName("M.R. Vinay");
		cc2.setCourse("Python");
		cc2.setAddress("Hyderabad");
		System.out.println("Name: " + cc2.getName() + ", course: " + cc2.getCourse() + ", Address: " + cc2.getAddress());
	}
}
