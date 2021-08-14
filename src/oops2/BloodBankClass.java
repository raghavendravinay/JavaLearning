package oops2;

public class EmergencyClass {
	public static void main(String[] args) {

		EmergencyNumbers en = new EmergencyNumbers("Police", 100);
		System.out.println(en);

		EmergencyNumbers en2 = new EmergencyNumbers("ambulance", 108);
		System.out.println(en2);

		EmergencyNumbers en3 = new EmergencyNumbers("Fire Engine", 101);
		System.out.println(en3);

		EmergencyNumbers en4 = new EmergencyNumbers("Women Help Line", 1091);
		System.out.println(en4);
	}

}
