package oops2;

public class HumanBodyClass {

	public static void main(String[] args) {

		System.out.println("New born baby details");
		
		HumanBodyBuilder hbb = new HumanBodyBuilder();
		HumanBody hb = new HumanBody("Baby1", 1, 2, 1, 1, 2, 2, 2);
		hbb.addChildDetails(hb);
		HumanBody hb2 = new HumanBody("Baby2", 2, 2, 1, 1, 2, 2, 2);
		hbb.addChildDetails(hb2);
		HumanBody hb3 = new HumanBody("Baby3", 1, 2, 1, 1, 2, 1, 2);
		hbb.addChildDetails(hb3);
		HumanBody hb4 = new HumanBody("Baby4", 1, 2, 1, 1, 2, 2, 1);
		hbb.addChildDetails(hb4);
		hbb.printchildrenDetails();
		
		hbb.removeChildDetails("Baby4");
		hbb.printchildrenDetails();
		
		System.out.println(hbb.getChildDetails("Baby4"));
		System.out.println(hbb.getChildDetails("Baby2"));
		
//		HumanBody hb = new HumanBody("Baby1", 1, 1, 2, 1, 1, 2, 1);
//		System.out.println(hb);
//		HumanBody hb2 = new HumanBody("Baby2", 1, 1, 1, 1, 1, 2, 2);
//		System.out.println(hb2);
//		HumanBody hb3 = new HumanBody();
//		hb3.setName("Baby3");
//		hb3.setEarsCount(2);
//		hb3.setEyesCount(2);
//		hb3.setHandsCount(2);
//		hb3.setHeadCount(1);
//		hb3.setMouthCount(1);
//		hb3.setNoseCount(1);
//		hb3.setLegCount(2);
//		System.out.println(hb3);
//		HumanBody hb4 = new HumanBody();
//		hb4.setName("Baby4");
//		hb4.setEarsCount(2);
//		hb4.setEyesCount(2);
//		hb4.setHandsCount(2);
//		hb4.setHeadCount(1);
//		hb4.setMouthCount(1);
//		hb4.setNoseCount(1);
//		hb4.setLegCount(2);
//		System.out.println("Baby Name: " + hb4.getName() + ", Head: " + hb4.getHeadCount() + ", Eyes: "
//				+ hb4.getEyescount() + ", Nose: " + hb4.getNoseCount() + ", Mouth: " + hb4.getMouthCount() + ", Ears: "
//				+ hb4.getEarsCount() + ", Hands: " + hb4.getHandscount() + ", Legs: " + hb4.getLegscount());

	}
}
