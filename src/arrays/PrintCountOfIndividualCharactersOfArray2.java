package arrays;

import java.util.Scanner;

public class PrintCountOfIndividualCharactersOfArray2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int array[]= new int[size];
		int i,j,k=0;
		int count;
		int temp[]=new int[size];
		int num[]=new int[size];
		System.out.println("Enter values into array");
		for(i=0; i<size; i++) {
			array[i]=sc.nextInt();
			temp[i]=array[i];
		}
		for(i=0; i<size; i++) {
			count=1;
			if(array[i]!=-1) {
				for(j=i+1; j<size; j++) {
					if(temp[i]==temp[j]) {
						++count;
						temp[j]=-1;
					}
				}
				num[k++]=count;
			}
		}
		k=0;
		for(i=0; i<size; i++) {
			if(temp[i]!=-1)
				System.out.println(temp[i]+" occurs "+num[k++]+" times");
		}
	}
}