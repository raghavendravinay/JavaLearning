package oops2;

public class Email {

	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String country;

	public Email(String firstName, String lastName, int yearOfBirth, String country) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.country = country;

	}

	public Email() {

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {
		return "FirstName: " + firstName + ", LastName: " + lastName + ", Country: " + country + ". Your mail Id is: "
				+ firstName.toLowerCase() + yearOfBirth + "@gmail.com";
	}

}
