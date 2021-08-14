package oops2;

public class MovieTickets {

	private String name;
	private String movie;
	private String theater;
	private int tickets;

	public MovieTickets() {

	}

	public String getName() {
		return name;
	}

	public String getMovie() {
		return movie;
	}

	public String getTheater() {
		return theater;
	}

	public int getTickets() {
		return tickets;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public void setTheater(String theater) {
		this.theater = theater;
	}
	public MovieTickets(String name, String movie, String theater, int tickets) {
		this.name = name;
		this.movie = movie;
		this.theater = theater;
		this.tickets = tickets;
	}

	public String toString() {
		return name + "\nMovie Name: " + movie + ", Theater: " + theater + ", Tickets: " + tickets
				+ "\nPrice: " + tickets * 200;
	}
}
