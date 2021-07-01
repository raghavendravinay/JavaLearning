package oops;

public class BookingMovieTickets {

	String place;
	String movieName;
	
	public void bookTickets() {
		if(movieName.equalsIgnoreCase("Bahubali") && place.equalsIgnoreCase("Balcony")) {
			System.out.println(" Venakteswara Theater \n " + movieName + "\n" + " Rs.200");
		}
		else if(movieName.equalsIgnoreCase("Bahubali") && place.equalsIgnoreCase("Benchi")) {
			System.out.println(" Venakteswara Theater \n " + movieName + "\n" + " Rs.150");
		}
		else if(movieName.equalsIgnoreCase("Bahubali") && place.equalsIgnoreCase("Kurchi")) {
			System.out.println(" Venakteswara Theater \n " + movieName + "\n" + " Rs.100");
		}
		else if(movieName.equalsIgnoreCase("Bahubali") && place.equalsIgnoreCase("Nela")) {
			System.out.println(" Venakteswara Theater \n " + movieName + "\n" + " Rs.80");
		}
		else {
			System.out.println("Invalid details. Choose correct details");
		}
	}
}
