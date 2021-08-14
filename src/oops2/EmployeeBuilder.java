package oops2;

import java.util.ArrayList;

public class EmployeeBuilder {

	ArrayList<Employee> list = new ArrayList<>();

	public void addEmployeeDetails(Employee e) {
		boolean flag = false;
		for (Employee ee : list) {
			if (ee.getEmployeeName().contentEquals(e.getEmployeeName())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			list.add(e);
		}
	}

	public boolean removeEmployee(String name) {
		Employee ee = null;
		boolean flag = false;
		for (Employee e : list) {
			if (e.getEmployeeName().equals(name)) {
				ee = e;
				flag = true;
				break;
			}
		}
		if (flag) {
			list.remove(ee);
			return flag;
		}
		return flag;
	}

	public void printEmployee() {
		for (Employee ee : list) {
			System.out.println(ee);
		}
		System.out.println();
	}

	public Employee getEmployee(String name) {
		for (Employee e : list) {
			if (e.getEmployeeName().equals(name)) {
				return e;
			}
		}
		return null;
	}

}
