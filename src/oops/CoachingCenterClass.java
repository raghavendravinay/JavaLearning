package oops;

public class CoachingCenterClass {

	public static void main(String[] args) {
		
		CoachingCenter cc = new CoachingCenter();
		cc.instituteName = "Naresh IT Technologies";
		cc.coarseName = "JAVA";
		
		cc.instituteName = "durga Institute";
		cc.coarseName = ".net";
		cc.printCoachingCenterDetails();

		cc.instituteName = "Qshore";
		cc.coarseName = "Python";
		cc.printCoachingCenterDetails();

		cc.instituteName = "Qshore";
		cc.coarseName = "C#";
		cc.printCoachingCenterDetails();

		
	}
}
