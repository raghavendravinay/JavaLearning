package bloodBankManagementSystem;

public class BloodBankMain {

	public static void main(String[] args) {
		BloodGroup apositive = new BloodGroup(1, " A+");
		BloodGroup bpositive = new BloodGroup(2, " B+");
		BloodGroup abpositive = new BloodGroup(3, " AB +");
		BloodGroup opositive = new BloodGroup(4, " O+");

		BloodBankBuilder bbb = new BloodBankBuilder();
		BloodBank bb = new BloodBank("Vinay", apositive, 9696858574l, "Tanuku");
		bbb.addbloodDonorDetails(bb);
		BloodBank bb2 = new BloodBank("Ravi", bpositive, 9696858574l, "Hyderabad");
		bbb.addbloodDonorDetails(bb2);
		BloodBank bb3 = new BloodBank("Raghav", abpositive, 9696858574l, "Vizag");
		bbb.addbloodDonorDetails(bb3);
		BloodBank bb4 = new BloodBank("Vinay", opositive, 9696858574l, "Tanuku");
		bbb.addbloodDonorDetails(bb4);
		bbb.printBloodDonors();

		bbb.removeDonorDetails("Vinay");
		bbb.printBloodDonors();

		System.out.println(bbb.getBloodDonor("Vinay"));
		System.out.println(bbb.getBloodDonor("Ravi"));
	}
}
