package oops2;

import java.util.ArrayList;

public class TravelsBuilder {

	ArrayList<Travels> list = new ArrayList<Travels>();
	
	public void addTicketstoList(Travels t) {
		boolean flag = false;
		for(Travels tv : list) {
			if(tv.getName().equals(t.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(t);
		}
	}
	
	public boolean ticketCancellation(String tname) {
		Travels name = null;
		boolean flag = false;
		for(Travels tr : list) {
			if(tr.getName().equals(tname)) {
				name = tr;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(name);
			return true;
		}
		return false;
	}
	
	public void printtravelRecords() {
		for(Travels t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
	
	public Travels getTravels(String tname) {
		for (Travels ts : list) {
			if(ts.getName().equals(tname)) {
				return ts;
			}
			
		}
		return null;
		
	}
}
