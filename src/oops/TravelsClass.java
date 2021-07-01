package oops;

public class TravelsClass {

	public static void main(String[] args) {
		
		Travels t = new Travels();

		t.passengerName = "Vinay";
		t.gender = "Male";
		t.age = 25;
		t.mobileNumber = "9595123758";
		t.address = "Tanuku";
		t.from = "Tanuku";
		t.to = "Hyderabad";
		t.bookingticket();

		Travels t2 = new Travels();

		t2.passengerName = "Vindya";
		t2.gender = "Female";
		t2.age = 24;
		t2.mobileNumber = "9595363758";
		t2.address = "Hyderabad";
		t2.from = "Hyderabad";
		t2.to = "Tanuku";
		t2.bookingticket();

		Travels t3 = new Travels();

		t3.passengerName = "RaVi";
		t3.gender = "male";
		t3.age = 3;
		t3.mobileNumber = "9595363758";
		t3.address = "Hyderabad";
		t3.from = "Hyderabad";
		t3.to = "Tanuku";
		t3.bookingticket();
	}
}
