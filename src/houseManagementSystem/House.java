package houseManagementSystem;

import java.util.ArrayList;

public class House {

	private String name;
	private double width;
	private double height;
	private int stairs;
	private long number;
	private ArrayList<Room> room;

	public House(String name, double width, double height, int stairs, long number, ArrayList<Room> room) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.stairs = stairs;
		this.number = number;
		this.room = room;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setStairs(int stairs) {
		this.stairs = stairs;
	}

	public int getStairs() {
		return stairs;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getNumber() {
		return number;
	}
	
	public void setRoom(ArrayList<Room> room) {
		this.room = room;
	}
	public ArrayList<Room> getRoom() {
		return room;
	}

	public String toString() {
		return "House [ name = " + name + ", Width = " + width + ", Height = " + height + ", Stairs = " + stairs
				+ ", Number= " + number + ", Rooms = " + room;
	}

}
