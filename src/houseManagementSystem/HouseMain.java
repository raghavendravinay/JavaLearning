package houseManagementSystem;

import java.util.ArrayList;

public class HouseMain {

public static void main(String[] args) {
	ArrayList<Room> room = new ArrayList<Room>();
	Room kitchen = new Room("Kitchen", 50, 40);
	Room bedRoom = new Room("Bed Room", 70, 40);
	Room hall = new Room("Hall", 60, 40);
	room.add(kitchen);
	room.add(bedRoom);
	room.add(hall);
	House hs = new House("My Homes", 200, 50, 5, 9005004002l, room);
	HouseBuilder hb = new HouseBuilder();
	hb.addHouseSpecifications(hs);
	
	House hs1 = new House("My Sweet Homes", 180, 40, 4, 9005004112l, room);
	hb.addHouseSpecifications(hs1);
	
	House hs2 = new House("Sweet Homes", 180, 40, 4, 9005004222l, room);
	hb.addHouseSpecifications(hs2);
	hb.printHouse();
	
	hb.removeHouseSpecifications("My Sweet Homes");
	hb.printHouse();
	
	System.out.println(hb.getHouse("My Homes"));
	System.out.println(hb.getHouse("My Sweet Homes"));
}

	
}
