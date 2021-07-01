package oops;

public class BookingMovieTicketsClass {

	public static void main(String[] args) {
		
		BookingMovieTickets bmt = new BookingMovieTickets();

		bmt.movieName = "Bahubali";
		bmt.place = "Balcony";
		bmt.bookTickets();

		BookingMovieTickets bmt2 = new BookingMovieTickets();

		bmt2.movieName = "Bahubali";
		bmt2.place = "Nela";
		bmt2.bookTickets();

		BookingMovieTickets bmt3 = new BookingMovieTickets();

		bmt3.movieName = "Robot";
		bmt3.place = "Nela";
		bmt3.bookTickets();
	}
}
