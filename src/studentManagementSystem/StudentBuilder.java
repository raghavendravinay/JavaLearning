package studentManagementSystem;

import java.util.ArrayList;

public class StudentBuilder {

	ArrayList<Student> list = new ArrayList<>();
	
	public void addStudent(Student s) {
		boolean flag = false;
		for(Student std : list) {
			if(std.getId() == s.getId()) {
				
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(s);
		}
	}
	public boolean removeStudent(int id) {
		boolean flag = false;
		Student std = null;
		for(Student sd : list) {
			if(sd.getId() == id) {
				std = sd;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(std);
			return flag;
		}
		return flag;
	}
	public void printStudents() {
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}
	
	public Student getStudent(int id) {
		for(Student s : list) {
			if(s.getId() == id) {
				return s;
			}
		}
		return null;
	}
	
	
	
}
