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

	public Travels() {

	}

	public String getName() {
		return passengerName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public int getTickets() {
		return noofTickets;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public String getAddress() {
		return address;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setTickets(int noofTickets) {
		this.noofTickets = noofTickets;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getPrice(int price) {
		this.price = price;
	}

	public Travels(String passengerName, int age, String gender, int noofTickets, String from, String to,
			String address) {
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
		this.noofTickets = noofTickets;
		this.from = from;
		this.to = to;
		this.address = address;
	}

	public String toString() {
		return "Passenger Name: " + passengerName + ", Age: " + age + ", gender: " + gender + ", No.of tickets: "
				+ noofTickets + ", From Adress: " + from + ", To Address: " + to + ", TicketPrice: " + noofTickets*500
				+ ", Address: " + address;

	}

}
