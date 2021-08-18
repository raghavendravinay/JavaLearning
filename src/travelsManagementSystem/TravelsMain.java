package travelsManagementSystem;

public class TravelsMain {
	
	public static void main(String[] args) {
		
		Gender male = new Gender("Male");
		Gender feMale = new Gender("FeMale");
		Gender others = new Gender("Others");
		Price priceForMale = new Price(male, 400);
		Price priceForFeMale = new Price(male, 350);
		Price priceForOthers = new Price(others, 300);
		
		TravelsBuilder tb = new TravelsBuilder();
		
		Travels t = new Travels("Vinay", 25, male, 1, "Tanuku", "Hyderabad", "Tanuku", priceForMale);
		tb.addTickets(t);
		Travels t2 = new Travels("Kishore", 20, others, 2, "Hyderabad", "Vizag", "Vizag", priceForOthers);
		tb.addTickets(t2);
		Travels t3 = new Travels("Priya", 23, feMale, 3, "Hyderabad", "Tanuku", "Hyderabad", priceForFeMale);
		tb.addTickets(t3);
		Travels t4 = new Travels("Vinay", 25, male, 1, "Tanuku", "Hyderabad", "Tanuku", priceForMale);
		tb.addTickets(t4);
		tb.printTravelers();
		
		tb.removeTickets("Priya");
		tb.printTravelers();
		
		System.out.println(tb.getTravelerDetails("Priya"));
		System.out.println(tb.getTravelerDetails("Vinay"));
	}

}
