package oops2;

public class EmailClass {

	public static void main(String[] args) {
		
		EmailBuilder eb = new EmailBuilder();
		Email e = new Email("Vinay", "M", 1995, "India");
		eb.addEmailDetails(e);
		Email e1 = new Email("Ravi", "M", 1996, "India");
		eb.addEmailDetails(e1);
		Email e2 = new Email("Raghav", "M", 1996, "India");
		eb.addEmailDetails(e2);
		eb.printEmails();
		eb.removeemail("Vinay");
		eb.printEmails();
		System.out.println(eb.getEmail("Vinay"));
		System.out.println(eb.getEmail("Ravi"));
		
		
//		Email e1 = new Email("RaghavendraVinay", "M", 1994, "India");
//		System.out.println(e);
//		System.out.println(e1);
//		Email e3 = new Email();
//		e3.setFirstName("Raghav");
//		e3.setLastName("M");
//		e3.setYearOfBirth(1996);
//		e3.setCountry("India");
//		System.out.println(e3);
	}
}
