package travelsManagementSystem;

import java.util.ArrayList;

public class TravelsBuilder {

	ArrayList<Travels> list = new ArrayList<>();
	
	public void addTickets(Travels t) {
		boolean flag = false;
		for(Travels tr : list) {
			if(tr.getName().equalsIgnoreCase(t.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(t);
		}
	}
	
	public boolean removeTickets(String name) {
		Travels t = null;
		boolean flag = false;
		for(Travels tr : list) {
			if(tr.getName().equalsIgnoreCase(name)) {
				t = tr;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(t);
			return flag;
		}
		return flag;
	}
	
	public void printTravelers() {
		for(Travels t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
	
	public Travels getTravelerDetails(String name) {
		for(Travels t : list) {
			if(t.getName().equalsIgnoreCase(name)) {
				return t;
			}
		}
			return null;
	}
}
