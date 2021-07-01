package oops;

public class HouseSpecifications {

	int noOfRooms;
	int width;
	int height;
	int stairs;
	int noOfDoors;
	
	public void printHouseSpecifications() {
		System.out.println(" My house contains " + noOfRooms + " rooms and " + noOfDoors + " doors "
	+ "width is " + width + " meters and height is " + height + " feets. And " + stairs + " stairs ");
	}
}
