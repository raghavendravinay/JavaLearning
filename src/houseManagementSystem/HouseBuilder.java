package houseManagementSystem;

import java.util.ArrayList;

public class HouseBuilder {

	ArrayList<House> list = new ArrayList<>();
	
	public void addHouseSpecifications(House hs) {
		boolean flag = false;
		for(House h : list) {
			if(h.getName().equals(hs.getName())){
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(hs);
		}
	}
	
	public boolean removeHouseSpecifications(String name) {
		House hs = null;
		boolean flag = false;
		for(House h : list) {
			if(h.getName().equals(name)) {
				hs = h;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(hs);
			return flag;
		}
		return flag;
	}
	
	public void printHouse() {
		for(House h : list) {
			System.out.println(h);
		}
		System.out.println();
	}
	
	public House getHouse(String name) {
		for(House h : list) {
			if(h.getName().equals(name)) {
				return h;
			}
		}
		return null;
	}
}
