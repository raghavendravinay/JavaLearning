package oops2;

import java.util.ArrayList;

public class EmailBuilder {

	ArrayList<Email> list = new ArrayList<>();

	public void addEmailDetails(Email e) {

		boolean flag = false;
		for (Email em : list) {
			if (em.getFirstName().equals(e.getFirstName())) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			list.add(e);
		}
	}

	public boolean removeemail(String fName) {
		Email e = null;
		boolean flag = false;
		for (Email em : list) {
			if (em.getFirstName().equals(fName)) {
				e = em;
				flag = true;
				break;
			}
		}
		if (flag) {
			list.remove(e);
			return flag;
		}
		return flag;
	}
	public void printEmails() {
		for(Email em : list) {
			System.out.println(em);
		}
		System.out.println();
	}
	public Email getEmail(String name) {
		for(Email em : list) {
			if(em.getFirstName().equals(name)) {
				return em;
			}
		}
		return null;
	}
}
