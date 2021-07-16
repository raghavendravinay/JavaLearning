package oops2;

public class HouseSpecfications {

	private int noOfRooms;
	private int width;
	private int height;
	private int stairs;
	private int noOfDoors;

	public HouseSpecfications(int noOfRooms, int width, int height, int stairs, int noOfDoors) {
		this.noOfRooms = noOfRooms;
		this.width = width;
		this.height = height;
		this.stairs = stairs;
		this.noOfDoors = noOfDoors;
	}

	public String toString() {
		return "Your House contains: " + noOfRooms + " Rooms, width: " + width + " Square feet, height: " + height
				+ " feet, no of Stairs: " + stairs + ", No of Doors: " + noOfDoors;
	}

}
