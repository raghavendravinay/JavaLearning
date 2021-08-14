package oops2;

import java.util.ArrayList;

public class HouseBuilder {

	ArrayList<HouseSpecifications> list = new ArrayList<HouseSpecifications>();
	
	public void addHouse(HouseSpecifications hs) {
		boolean flag = false;
		for(HouseSpecifications hsp : list) {
			if(hsp.getName() == hs.getName()) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(hs);
		}
	}
	public String removeHouseSpecifictions(String name) {
		for(HouseSpecifications hs: list) {
			if(hs.getName() == name) {
				list.remove(hs);
				return "Removed " + name + " from the list";
			}
		}
		return "found no result";
		
	}
	public String removeHouseSpecifictions2(String name) {
		HouseSpecifications s = null;
		boolean b = false;
		for(HouseSpecifications hs: list) {
			if(hs.getName() == name) {
				s= hs;
				b = true;
				break;
			}
		}if(b) {
			list.remove(s);
			return s + "removed";
		}
		else {
			
		return "found no result";
		}
		
	}
	public void printHouseSpecifications() {
		for(HouseSpecifications hs : list) {
			System.out.println(hs);
		}
		System.out.println();
	}
	public HouseSpecifications getHouseSpecifications(String name) {
		for(HouseSpecifications hs: list) {
			if(hs.getName() == name) {
				return hs;
			}
		}
		return null;
	}
}
