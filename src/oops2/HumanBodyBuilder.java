package oops2;

import java.util.ArrayList;

public class HumanBodyBuilder {

	ArrayList<HumanBody> list = new ArrayList<>();

	public void addChildDetails(HumanBody hb) {
		boolean flag = false;
		for(HumanBody h : list) {
		if(h.getName().equals(hb.getName())) {
			flag = true;
			break;
		}
		}
		if(!flag) {
			list.add(hb);
		}
	}
	
	public boolean removeChildDetails(String name) {
		HumanBody hb = null;
		boolean flag = false;
		for(HumanBody hbd : list) {
			if(hbd.getName().equals(name)) {
				hb = hbd;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(hb);
			return flag;
		}
			return flag;
	}
	
	public void printchildrenDetails() {
		for(HumanBody hb : list) {
			System.out.println(hb);
		}
		System.out.println();
	}
	public HumanBody getChildDetails(String name) {
		for(HumanBody hb : list) {
			if(hb.getName().equals(name)) {
				return hb;
			}
		}
		return null;
	}
}
