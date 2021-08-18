package travelsManagementSystem;

public class Travels {

	private String name;
	private int age;
	private Gender gender;
	private int noOfTickets;
	private String from;
	private String to;
	private String address;
	private Price price;

	public Travels(String name, int age, Gender gender, int noOfTickets, String from, String to, String address,
			Price price) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.noOfTickets = noOfTickets;
		this.from = from;
		this.to = to;
		this.address = address;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public String toString() {
		return "Travels [name=" + name + ", age=" + age + ", " + gender + ", noOfTickets=" + noOfTickets
				+ ", from=" + from + ", to=" + to + ", address=" + address + ", " + price + "]";
	}

}
