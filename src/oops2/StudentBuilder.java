package oops2;

import java.util.ArrayList;

public class StudentBuilder {

	ArrayList<Student> list = new ArrayList<Student>();

	public void addStudent(Student s) {
		boolean flag = false;
		for (Student std : list) {
		if (std.getId() == s.getId()) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			list.add(s);
		}
	}

	public boolean removeStudent(int stdID) {
		Student s = null;
		boolean flag = false;
		for (Student std : list) {
			if (std.getId() == stdID) {
				s = std;
				flag = true;
				break;
			}
		}
		if (flag) {
			list.remove(s);
			return true;
		}
		return false;
	}

	public void printStudent() {
		for (Student s : list) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}

	public Student getStudent(int id) {
		for (Student s : list) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}
}
