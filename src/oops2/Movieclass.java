package oops2;

public class Movieclass {

	public static void main(String[] args) {

		MovieBuilder mb = new MovieBuilder();
		MovieTickets mt = new MovieTickets("Vinay", "Bahubali", "Venkateswara", 3);
		mb.addMovieTickets(mt);
		MovieTickets mt2 = new MovieTickets("Vinay", "Bahubali", "Venkateswara", 3);
		mb.addMovieTickets(mt2);
		MovieTickets mt3 = new MovieTickets("Raghav", "RRR", "SriChitra", 5);
		mb.addMovieTickets(mt3);
		MovieTickets mt4 = new MovieTickets("Ravi", "Robot", "Prathyusha", 1);
		mb.addMovieTickets(mt4);
		mb.printTicketValues();
		mb.removeTickets("Raghav");
		mb.printTicketValues();
		System.out.println(mb.getMovieTickets("Vinay"));
		
		
		
		
//		MovieTickets mt = new MovieTickets("Vinay", "Bahubali", "Venkateswara", 2);
//		System.out.println(mt);
//		MovieTickets mt2 = new MovieTickets("Raghavendra", "Robot", "Prathyusha", 1);
//		System.out.println(mt2);
//		MovieTickets mt3 = new MovieTickets();
//		mt3.setName("Raghav");
//		mt3.setMovie("Bahubali");
//		mt3.setTheater("Padmasri");
//		mt3.setTickets(3);
//		System.out.println(mt3);
//
//		MovieTickets mt4 = new MovieTickets();
//		mt4.setName("Raghavendra Vinay");
//		mt4.setMovie("Saho");
//		mt4.setTheater("Padmasri");
//		mt4.setTickets(1);
//		System.out.println(("Name: " + mt4.getName() + ", Movie Name: " + mt4.getMovie() + ", Theater: "
//				+ mt4.getTheater() + ", Tickets: " + mt4.getTickets() + ", Price: " + mt4.getTickets() * 200));
	}
}
