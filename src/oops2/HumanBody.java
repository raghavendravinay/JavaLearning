package oops2;

public class HumanBody {

	private int head;
	private int nose;
	private int ears;
	private int mouth;
	private int legs;
	private int hands;
	private int eyes;
	private String name;

	public HumanBody() {

	}

	public String getName() {
		return name;
	}
	public int getHeadCount() {
		return head;
	}

	public int getNoseCount() {
		return nose;
	}

	public int getEarsCount() {
		return ears;
	}

	public int getMouthCount() {
		return mouth;
	}

	public int getLegscount() {
		return legs;
	}

	public int getHandscount() {
		return hands;
	}

	public int getEyescount() {
		return eyes;
	}

	public int getLegsCount() {
		return legs;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHeadCount(int head) {
		this.head = head;
	}

	public void setNoseCount(int nose) {
		this.nose = nose;
	}

	public void setEyesCount(int eyes) {
		this.eyes = eyes;
	}

	public void setMouthCount(int mouth) {
		this.mouth = mouth;
	}

	public void setEarsCount(int ears) {
		this.ears = ears;
	}

	public void setHandsCount(int hands) {
		this.hands = hands;
	}

	public void setLegCount(int legs) {
		this.legs = legs;
	}

	public HumanBody(String name, int head, int eyes, int nose, int mouth, int ears, int hands, int legs) {

		this.name = name;
		this.head = head;
		this.nose = nose;
		this.ears = ears;
		this.mouth = mouth;
		this.legs = legs;
		this.hands = hands;
		this.eyes = eyes;
	}

	public String toString() {
		return "Baby name: " + name + ", Head: " + head + ", Eyes: " + eyes + ", Nose: " + nose + ", Mouth: " + mouth
				+ ", Ears: " + ears + ", Hands: " + hands + ", Legs: " + legs;
	}
}
