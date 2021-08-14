package oops2;

public class TravelsClass {

	public static void main(String[] args) {
		
		TravelsBuilder tb = new TravelsBuilder();
		Travels  t = new Travels("Vinay", 25, "male", 4, "Tanuku", "Hyderabad", "Tanuku");
		tb.addTicketstoList(t);
		Travels  t1 = new Travels("Vinay", 25, "male", 4, "Tanuku", "Hyderabad", "Tanuku");
		tb.addTicketstoList(t1);
		tb.printtravelRecords();
		Travels  t2 = new Travels("Ravi", 24, "male", 2, "Hyderabad", "Tanuku", "Tanuku");
		tb.addTicketstoList(t2);
		tb.printtravelRecords();
		tb.ticketCancellation("Ravi");
		tb.printtravelRecords();
		System.out.println(tb.getTravels("Vinay"));

//		Travels t = new Travels("Vinay", 25, "Male", 4, "Tanuku", "Hyderabad", "Tanuku");
//		System.out.println(t);
//		Travels t2 = new Travels();
//		t2.setName("Raghavendra");
//		t2.setAge(25);
//		t2.setGender("Male");
//		t2.setTickets(3);
//		t2.setFrom("Hyderabad");
//		t2.setTo("Tanuku");
//		t2.setAddress("Tanuku");
//		System.out.println(t2);
//
//		Travels t3 = new Travels();
//		t3.setName("Raghavendra");
//		t3.setAge(25);
//		t3.setGender("Male");
//		t3.setTickets(1);
//		t3.setFrom("Hyderabad");
//		t3.setTo("Tanuku");
//		t3.setAddress("hyderabad");
//		System.out.println(("Passenger Name: " + t3.getName() + ", Age: " + t3.getAge() + ", gender: " + t3.getGender()
//				+ ", No.of tickets: " + t3.getTickets() + ", From Adress: " + t3.getFrom() + ", To Address: "
//				+ t3.getTo() + ", TicketPrice: " + t3.getTickets() * 500 + ", Address: " + t3.getAddress()));
//	
		}
}
