package patterns;
import java.util.Scanner;
public class PyramidPattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");		//	ex:num=5
		int num=sc.nextInt();						//	555555555
		for(int i=num; i>0; i--) {					//	 4444444
			for(int j=1; j<=num-i; j++) {			//	  33333
				System.out.print(" ");				//	   222
			}										//		1
			for(int k=1; k<2*i; k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
