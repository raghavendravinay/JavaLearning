package employeeManagementSystem;

import java.util.ArrayList;

public class EmployeeBuilder {

	ArrayList<Employee> list = new ArrayList<>();
	
	public void addEmployee(Employee emp) {
		boolean flag = false;
		for(Employee e : list) {
			if(e.getName().equalsIgnoreCase(emp.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(emp);
		}
	}
	
	public boolean removeEmployee(String empname) {
		boolean flag = false;
		Employee name = null;
		for(Employee e : list) {
			if(e.getName().equalsIgnoreCase(empname)) {
				name = e;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(name);
			return flag;
		}
		return flag;
	}
	
	public void printEmployeeDetails() {
		for(Employee emp : list) {
			System.out.println(emp);
		}
		System.out.println();
	}
	
	public Employee getEmployee(String name) {
		for(Employee emp : list) {
			if(emp.getName().equalsIgnoreCase(name)) {
				return emp;
			}
		}
		return null;
	}
}
