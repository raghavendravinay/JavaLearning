package oops2;

public class HouseSpecifications {

	private String name;
	private int noOfRooms;
	private int width;
	private int height;
	private int stairs;
	private int noOfDoors;
	private long number;

	public HouseSpecifications() {

	}

	public String getName() {
		return name;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}

	public int getWidth() {
		return width;
	}

	public int getheight() {
		return height;
	}

	public int getStairs() {
		return stairs;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}
	public long getNumber() {
		return number;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setStairs(int stairs) {
		this.stairs = stairs;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	
	public void setNumber(long number) {
		this.number = number;
	}

	public HouseSpecifications(String name, int noOfRooms, int width, int height, int stairs, int noOfDoors, long number) {
		this.name = name;
		this.noOfRooms = noOfRooms;
		this.width = width;
		this.height = height;
		this.stairs = stairs;
		this.noOfDoors = noOfDoors;
		this.number = number;
	}

	public String toString() {
		return "House for sale \n" + stairs + " stair(s) buildling \n" + noOfRooms + "bhk, width: " + width + "Square feet, height: " + height
				+"feets, No of Doors: " + noOfDoors + name + ",\n Contact Number: " + number+ "\n"; 
	}
//	public String toString1() {
//		return "Your House contains: " + noOfRooms + " Rooms, width: " + width + " Square feet, height: " + height
//				+ " feets, No. of Stairs: " + stairs + ", No of Doors: " + noOfDoors;
//	}

}
