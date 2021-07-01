package oops;

public class Employee {

	String employeeName;
	int id;
	String designation;
	int exp;

	public void printEmployeeDetails() {
		if(exp == 1)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.10000/-");
		else if(exp == 2)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.20000/-");
		else if(exp == 3)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.40000/-");
		else if(exp == 4)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.60000/-");
		else if(exp == 5)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.80000/-");
		else if(exp == 6)
			System.out.println("Employee Name = " + employeeName + " , ID = " + id + " , Designation = " + designation + " , exp = " + exp + " years, " + " salary = RS.100000/-");
		else {
			System.out.println("Enter valid data");
		}
	}


}
