package practice;

import java.util.Scanner;

public class practiceLinearSearch {
	static Scanner sc = new Scanner(System.in);
	static int num;
	static int flag=0;
	public static void main(String[] args) {
		int arr[] = {45,19,7,2,1,33,87,92,10,33};
		
		//User input from console.
//		for(int i=0; i<arr.length; i++){
//			System.out.println("Enter element "+(i+1)+" in the array: ");
//			arr[i] = sc.nextInt();
//		}
		
		// To display the elements in the array.
		System.out.print("Element in the array: { ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.print("}");
		System.out.println("\nEnter element to be searched in the array: ");
		num = sc.nextInt();
		
		//Linear search algorithm
		for(int i=0; i<arr.length; i++){
			if(num == arr[i]){
				System.out.println("Element found at position: "+i);
				flag++;
			}
		}
		if(flag == 0){
			System.err.println("Element not found!!!");
		}
		

	}

}
