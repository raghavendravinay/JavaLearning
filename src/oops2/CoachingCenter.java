package oops2;

public class CoachingCenter {

	private String name;
	private String course;
	private String address;

	public CoachingCenter() {

	}

	public CoachingCenter(String name, String course, String address) {
		this.name = name;
		this.course = course;
		this.address = address;
	}

	public String toString() {
		return "Name: " + name + ", Coarse: " + course + ", Address: " + address;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getAddress() {
		return address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
