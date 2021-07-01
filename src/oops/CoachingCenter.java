package oops;

public class CoachingCenter {

	String instituteName;
	String coarseName;
	
	public void printCoachingCenterDetails() {
	if(coarseName.equalsIgnoreCase("java"))	{
		System.out.println(instituteName + " will provide " + coarseName + 
		" with realtime projects, material and certification. \\nfees: 15000. "
		+ " we also provide Python, .net, c#" );
	}
	else if(coarseName.equalsIgnoreCase(".net"))	{
		System.out.println(instituteName + " will provide " + coarseName + 
		" with realtime projects, material and certification. \nfees: 20000" 
		+ "we also provide Python, Java, c#");
	}
	else if(coarseName.equalsIgnoreCase("Python"))	{
		System.out.println(instituteName + " will provide " + coarseName + 
		" with realtime projects, material and certification. \nfees: 10000" 
		+ " we also provide .net, Java, c#");
	}
	else if(coarseName.equalsIgnoreCase("C#"))	{
		System.out.println(instituteName + " will provide " + coarseName + 
		" with realtime projects, material and certification. \nfees: 16000" 
		+ " we also provide Python, Java, .net");
	}
	else {
		System.out.println("We don't have that coarse");
	}
	}
}
