package jobRegistrationManagementSystem;

import java.util.ArrayList;

public class JobRegistrationBuilder {

ArrayList<JobRegistration> list = new ArrayList<>();
	
	public void addApplicantDetails(JobRegistration jr) {
		boolean flag = false;
		for(JobRegistration jrg : list) {
			if(jrg.getName().equals(jr.getName())) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(jr);
		}
	}
	
	public boolean removeApplicant(String name) {
		JobRegistration jrn = null;
		boolean flag = false;
		for(JobRegistration jr : list) {
			if(jr.getName().equals(name)) {
				jrn = jr;
				flag = true;
				break;
			}
		}
		if(flag) {
			list.remove(jrn);
			return flag;
		}
		return flag;
	}
	public void printApplicants() {
		for(JobRegistration jr : list) {
			System.out.println(jr);
		}
		System.out.println();
	}
	public JobRegistration getApplicantDetails(String name) {
		for(JobRegistration jr : list) {
			if(jr.getName().equals(name)) {
				return jr;
			}
		}
		return null;
	}
}
