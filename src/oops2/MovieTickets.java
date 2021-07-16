package oops2;

public class MovieTickets {

	private String name;
	private String movie;
	private String theater;
	private int tickets;

	public MovieTickets(String name, String movie, String theater, int tickets) {
		this.name = name;
		this.movie = movie;
		this.theater = theater;
		this.tickets = tickets;
	}

	public String toString() {
		return "Name: " + name + ", Movie Name: " + movie + ", Theater: " + theater + ", Tickets: " + tickets
				+ ", Price: " + tickets * 200;
	}
}
