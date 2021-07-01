package oops;

public class EmailRegistrationClass {

	public static void main(String[] args) {
		EmailRegistration er = new EmailRegistration();
		er.firstName = "Raghavendra";
		er.lastName = "Manikireddy";
		er.age = 25;
		er.mobileNumber = "9867543210";
		er.printUserDetails();
		EmailRegistration er2 = new EmailRegistration();
		er2.firstName = "Vinay";
		er2.lastName = "Manikireddy";
		er2.age = 25;
		er2.mobileNumber = "9867546898";
		er2.printUserDetails();
	}
}
