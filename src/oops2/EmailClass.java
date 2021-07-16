package oops2;

public class EmailClass {

	public static void main(String[] args) {

		Email e = new Email("Vinay", "M", 1995, "India");
		Email e1 = new Email("RaghavendraVinay", "M", 1994, "India");
		System.out.println(e);
		System.out.println(e1);
		Email e3 = new Email();
		e3.setFirstName("Raghav");
		e3.setLastName("M");
		e3.setYearOfBirth(1996);
		e3.setCountry("India");
		System.out.println(e3);
	}
}
