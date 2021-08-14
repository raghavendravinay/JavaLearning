package oops2;

import java.util.ArrayList;

public class CoachingCenterBuilder {

	ArrayList<CoachingCenter> list = new ArrayList<>();
	
	public void registerStudent(CoachingCenter cc) {
		boolean flag = false;
		for(CoachingCenter ccr : list) {
			if(ccr.getName().equals(cc.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(cc);
		}
	}
	
	public boolean removeStudent(String sName) {
		CoachingCenter cc= null;
		boolean flag = false;
		for(CoachingCenter ccr : list) {
			if(ccr.getName().equals(sName)) {
				cc = ccr;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(cc);
			return true;
		}
		return false;
	}
	
	public void printStudents() {
		for(CoachingCenter ccr : list) {
			System.out.println(ccr);
		}
		System.out.println();
	}
	
	public CoachingCenter getStudents(String cName) {
		
		for(CoachingCenter ccr : list) {
			if(ccr.getName().equals(cName)) {
				return ccr;
			}
		}
		return null;
		
	}
}
