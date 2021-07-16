package oops2;

public class HumanBody {

	private int head;
	private int nose;
	private int ears;
	private int mouth;
	private int legs;
	private int hands;
	private int body;
	private int eyes;

	public HumanBody(int body, int head, int eyes, int nose, int mouth, int ears, int hands, int legs) {

		this.head = head;
		this.body = body;
		this.nose = nose;
		this.ears = ears;
		this.mouth = mouth;
		this.legs = legs;
		this.hands = hands;
		this.body = body;
		this.eyes = eyes;
	}

	public String toString() {
		return "Body: " + body + ", Head: " + head + ", Eyes: " + eyes + ", Nose: " + nose + ", Mouth: " + mouth
				+ ", Ears: " + ears + ", Hands: " + hands + ", Legs: " + legs;
	}
}
