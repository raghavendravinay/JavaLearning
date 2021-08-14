package oops2;

public class StudentClass {

	public static void main(String args[]) {

		StudentBuilder sb = new StudentBuilder();
		Student s = new Student(101, "Vinay1", "ECE");
		sb.addStudent(s);
		Student s1 = new Student(102, "Vinay2", "ECE");
		sb.addStudent(s1);
		Student s2 = new Student(103, "Vinay3", "ECE");
		sb.addStudent(s2);
		Student s3 = new Student(103, "Vinay3", "ECE");
		sb.addStudent(s3);
		sb.printStudent();
		sb.removeStudent(103);
		sb.printStudent();
		System.out.println(sb.getStudent(101));
		System.out.println(sb.getStudent(103));
		
		
		//		s.setId(5);
//		s.setName("Vinay");
//		s.setBranch("ECE");
//		System.out.println(s.getId());
//		System.out.println(s.getName());
//		System.out.println(s.getBranch());
//		System.out.println(s);
//		Student s1 = new Student(101, "Vinay", "ECE");
//		System.out.println(s1);

	}
}
