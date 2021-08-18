package coachingCenterManagementSystem;

public class CoachingCenter {

	private String name;
	private Course course;
	private long number;
	private String address;

	public CoachingCenter(String name, Course course, long number, String address) {
		super();
		this.name = name;
		this.course = course;
		this.number = number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "CoachingCenter [ name = " + name + ", course " + course + ", number = " + number + ", address = "
				+ address + "]";
	}

}
