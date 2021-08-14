package oops2;

import java.util.ArrayList;

public class BloodBankBuilder {

	ArrayList<BloodBank> list = new ArrayList<>();
	
	public void addbloodDonorDetails(BloodBank bb) {
		boolean flag = false;
		for(BloodBank bbk : list) {
			if(bbk.getName().equalsIgnoreCase(bb.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(bb);
		}
	}
	
	public boolean removeDonorDetails(String name) {
		BloodBank bb = null;
		boolean flag = false;
		for(BloodBank bbk : list) {
			if(bbk.getName().equals(name)) {
				bb = bbk;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(bb);
			return flag;
		}
		return flag;
	}
	public void printBloodDonors() {
		for(BloodBank bb : list) {
			System.out.println(bb);
		}
		System.out.println();
	}
	
	public BloodBank getBloodDonor(String name) {
		for(BloodBank bb : list) {
			if(bb.getName().equals(name)) {
				return bb;
			}
		}
		return null;
	}
	
}
