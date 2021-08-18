package houseManagementSystem;

public class Room {

	private String name;
	private double width;
	private double height;

	public Room(String name, double width, double height) {
		this.name = name;
		this.width = width;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String toString() {
		return "Room [name=" + name + ", width=" + width + ", height=" + height + "]";
	}

}
