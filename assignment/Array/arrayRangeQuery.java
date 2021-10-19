package assignment.Array;

import java.util.Scanner;

public class arrayRangeQuery {

	

	public static void main(String[] args) {
		int a=0,b=0;
		int [] arr = {8,90,10,14,30,20,13};
		System.out.println("Array: ");
		for(int i=0; i<7; i++){
			System.out.println("Array Element "+i+" "+ "= "+arr[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st index: ");
		Integer n1 = sc.nextInt();  
		
		for(int j=0; j<=n1; j++){
			a=arr[j];
		}
		System.out.println("1st Index number is: "+a);
		
		System.out.println("Enter 2nd index: ");
		Integer n2 = sc.nextInt(); 

		for(int j=0; j<=n2; j++){
			b=arr[j];
		}
		System.out.println("2nd Index number is: "+b);

		System.out.println("Addition: "+(a+b));
		}
		

    
}
