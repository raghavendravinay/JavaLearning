package travelsManagementSystem;

public class Price {

	private Gender gender;
	private int price;

	public Price(Gender male, int price) {
		super();
		this.gender = male;
		this.price = price;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "Price [" + gender + ", price=" + price + "]";
	}

}
