package oops2;

public class Travels {

	private String passengerName;
	private int age;
	private String gender;
	private int noofTickets;
	private String from;
	private String to;
	private String address;
	private int price;

	public Travels(String passengerName, int age, String gender, int noofTickets, String from, String to,
			String address, int price) {
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
		this.noofTickets = noofTickets;
		this.from = from;
		this.to = to;
		this.address = address;
		this.price = price;
	}

	public String toString() {
		return "Passenger Name: " + passengerName + ", Age: " + age + ", gender: " + gender + ", No.of tickets: "
				+ noofTickets + ", From Adress: " + from + ", To Address: " + to + ", TicketPrice: " + price
				+ ", Address: " + address;

	}

}
