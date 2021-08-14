package oops2;

public class EmployeeClass {

	public static void main(String[] args) {
		EmployeeBuilder eb = new EmployeeBuilder();
		Employee e = new Employee("Vinay", 2, 138, "QA Engineer");
		eb.addEmployeeDetails(e);
		Employee e2 = new Employee("Ravi", 3, 131, "Developer");
		eb.addEmployeeDetails(e2);
		Employee e3 = new Employee("Raghav", 1, 139, "Support Engineer");
		eb.addEmployeeDetails(e3);
		Employee e4 = new Employee("Vinay", 2, 138, "QA Engineer");
		eb.addEmployeeDetails(e4);
		eb.printEmployee();
		
		eb.removeEmployee("Vinay");
		eb.printEmployee();
		
		System.out.println(eb.getEmployee("Ravi"));
		System.out.println(eb.getEmployee("Vinay"));
//		Employee e = new Employee("Vinay", 5, 101, "QA Engineer");
//		System.out.println(e);
//		Employee e1 = new Employee();
//		e1.setEmployeeName("Raghav");
//		e1.setExperience(2);
//		e1.setDesignation("Test Engineer");
//		e1.setId(102);
//		System.out.println(e1);
//
//		Employee e2 = new Employee();
//		e2.setEmployeeName("Vinay M");
//		e2.setExperience(3);
//		e2.setDesignation("Test Engineer");
//		e2.setId(103);
//		System.out.println("Employee Name: " + e2.getEmployeeName() + ", Designation: " + e2.getDesignation()
//		+ ", Experience: " + e2.getExperience() + ", ID: " + e2.getID());
	}
}
