package oops2;

public class StudentClass {

	public static void main(String args[]) {

		Student s = new Student();
		s.setId(5);
		s.setName("Vinay");
		s.setBranch("ECE");
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getBranch());
		System.out.println(s);
		Student s1 = new Student(101, "Vinay", "ECE");
		System.out.println(s1);

	}
}
