package oops2;

public class HouseClass {

	public static void main(String[] args) {
		System.out.println("Post your house specifications here");
		HouseSpecifications hs = new HouseSpecifications("Vinay", 4, 450, 30, 4, 6, 9694959798L);
		HouseBuilder hb = new HouseBuilder();
		hb.addHouse(hs);
		hb.printHouseSpecifications();
		
		HouseSpecifications hs2 = new HouseSpecifications("Ravi", 4, 600, 40, 3, 5, 9999999999L);
		hb.addHouse(hs2);
		hb.printHouseSpecifications();
		HouseSpecifications hs3 = new HouseSpecifications("Raghav", 3, 300, 30, 4, 6, 9999999999L);
		hb.addHouse(hs3);
		hb.printHouseSpecifications();
		
		System.out.println(hb.removeHouseSpecifictions("Vinay1"));
		System.out.println(hb.removeHouseSpecifictions("Raghav"));
		
		hb.printHouseSpecifications();
		
		System.out.println(hb.getHouseSpecifications("Ravi"));
		
		

//		HouseSpecifications hs = new HouseSpecifications(4, 500, 40, 3, 4);
//		System.out.println(hs);
//
//		HouseSpecifications hs2 = new HouseSpecifications(4, 200, 30, 3, 4);
//		System.out.println(hs2);
//
//		HouseSpecifications hs3 = new HouseSpecifications();
//		hs3.setNoOfRooms(3);
//		hs3.setWidth(600);
//		hs3.setHeight(40);
//		hs3.setStairs(3);
//		hs3.setNoOfDoors(4);
//		System.out.println(hs3);
//
//		HouseSpecifications hs4 = new HouseSpecifications();
//		hs4.setNoOfRooms(3);
//		hs4.setWidth(600);
//		hs4.setHeight(40);
//		hs4.setStairs(3);
//		hs4.setNoOfDoors(4);
//		System.out.println("Your House contains: " + hs4.getNoOfRooms() + " Rooms, width: " + hs4.getWidth()
//				+ " square feet, height: " + hs4.getheight() + " feets, No. of Stairs: " + hs4.getStairs()
//				+ ", No of Doors: " + hs4.getNoOfDoors());

	}
}
