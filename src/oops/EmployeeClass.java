package oops;

public class EmployeeClass {

	public static void main(String[] args) {
		
		Employee e = new Employee();

		e.employeeName = "RaVi";
		e.id = 290611052;
		e.designation = "QA Manager";
		e.exp = 3;
		e.printEmployeeDetails();

		Employee e2 = new Employee();

		e2.employeeName = "RaM";
		e2.id = 290611053;
		e2.designation = "Senior Developer";
		e2.exp = 5;
		e2.printEmployeeDetails();
	}
}
