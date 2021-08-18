package studentManagementSystem;

public class StudentMain {

	public static void main(String[] args) {
		
		Branch branch = new Branch(1, "ECE");
		Branch branch2 = new Branch(2, "CSE");
		Branch branch3 = new Branch(3, null);
		branch3.setBranch("EEE");
		
		StudentBuilder sb = new StudentBuilder();
		Student s = new Student(121, "Vinay", branch);
		sb.addStudent(s);
		Student s2 = new Student(122, "Ravi", branch2);
		sb.addStudent(s2);
		Student s3 = new Student(123, "Raghav", branch3);
		sb.addStudent(s3);
		Student s4 = new Student(123, "Vinay", branch3);
		sb.addStudent(s4);
		Student s5 = new Student(121, "Vinay", branch);
		sb.addStudent(s5);
		Student s6 = new Student(124, "Ravi", branch);
		sb.addStudent(s6);
		Student s7 = new Student(125, "Raghav", branch3);
		sb.addStudent(s7);
		Student s8 = new Student(126, "Vinay", branch3);
		sb.addStudent(s8);
		
		sb.printStudents();
		
		sb.removeStudent(123);
		sb.printStudents();
		
		System.out.println(sb.getStudent(121));
		System.out.println(sb.getStudent(123));
	}
}
