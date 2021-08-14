package oops2;

public class EmergencyNumbers {

	private String Department;
	private int number;

	public EmergencyNumbers(String Department, int number) {
		this.Department = Department;
		this.number = number;
	}

	public String toString() {
		return Department + ": " + number;

	}
}
