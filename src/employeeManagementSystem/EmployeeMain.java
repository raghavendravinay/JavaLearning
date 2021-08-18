package employeeManagementSystem;

public class EmployeeMain {

	public static void main(String[] args) {

		Designation Manager = new Designation(1, "Manager");
		Designation QAEngineer = new Designation(2, "QA Engineer");
		Designation Developer = new Designation(3, "Developer");
		
		EmployeeBuilder eb = new EmployeeBuilder();
		
		Employee emp = new Employee("Vinay", 2, 123, QAEngineer);
		eb.addEmployee(emp);
		Employee emp2 = new Employee("Ravi", 1, 125, Developer);
		eb.addEmployee(emp2);
		Employee emp3 = new Employee("Vinay", 2, 124, QAEngineer);
		eb.addEmployee(emp3);
		Employee emp4 = new Employee("Raghav", 3, 121, Manager);
		eb.addEmployee(emp4);
		eb.printEmployeeDetails();

		eb.removeEmployee("Raghav");
		eb.printEmployeeDetails();

		System.out.println(eb.getEmployee("Vinay"));
		System.out.println(eb.getEmployee("Raghav"));

	}
}
