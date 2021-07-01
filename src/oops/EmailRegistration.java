package oops;

public class EmailRegistration {

	String firstName;
	String lastName;
	int age;
	String mobileNumber;
	public void printUserDetails() {
		System.out.println("Username: " + firstName + " " + lastName + ", Age: " + age 
				+ ", Mobile Number: " + mobileNumber + ", MailId: " + firstName.toLowerCase() + "@gmail.com");
	}
}
