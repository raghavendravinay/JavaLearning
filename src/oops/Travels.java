package oops;

public class Travels {

	int tickets;
	String passengerName;
	String gender;
	int age;
	String mobileNumber;
	String address;
	String from;
	String to;
	String ticketPrice;
	
	public void bookingticket() {
		System.out.println("Passenger Name : " + passengerName + ", \nGender : " + gender + 
				", \nmobile number: " + mobileNumber + ", \nAddress: " + address + ". \nFrom: "
				+ from + ", \nTo: " + to );
		if(from.equalsIgnoreCase("Tanuku") && to.equalsIgnoreCase("Hyderabad") && age <= 6) {
			System.out.println("TicketPrice is 400");
		}
		else if(from.equalsIgnoreCase("Hyderabad") && to.equalsIgnoreCase("Tanuku") && age <= 6) {
			System.out.println("TicketPrice is 400");
		}
		else if(from.equalsIgnoreCase("Tanuku") && to.equalsIgnoreCase("Hyderabad") && age > 6) {
			System.out.println("TicketPrice is 600");
		}
		
		else if(from.equalsIgnoreCase("Hyderabad") && to.equalsIgnoreCase("Tanuku") && age > 6) {
			System.out.println("TicketPrice is 600");
		}
		else {
			System.out.println("Choose correct details");
		}
	}
}
