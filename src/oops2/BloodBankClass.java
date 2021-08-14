package oops2;

public class BloodBankClass {
	public static void main(String[] args) {

		BloodBankBuilder bb = new BloodBankBuilder();
		BloodBank bbk = new BloodBank("Ravi", "A+", 9494949595l, "Tanuku");
		bb.addbloodDonorDetails(bbk);
		BloodBank bbk2 = new BloodBank("Raghav", "B+", 9696949596l, "Hyderabad");
		bb.addbloodDonorDetails(bbk2);
		BloodBank bbk3 = new BloodBank("Vinay", "AB+", 9494949595l, "Tanuku");
		bb.addbloodDonorDetails(bbk3);
		BloodBank bbk4 = new BloodBank("Vinay", "AB+", 9696949596l, "Hyderabad");
		bb.addbloodDonorDetails(bbk4);
		bb.printBloodDonors();
		bb.removeDonorDetails("Vinay");
		bb.removeDonorDetails("Vinay");
		bb.printBloodDonors();
		System.out.println(bb.getBloodDonor("Raghav"));
		System.out.println(bb.getBloodDonor("Vinay"));

	}

}
