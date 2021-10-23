package practice;

import java.util.Arrays;
import java.util.Scanner;

public class practiceBinarySearch {
	static Scanner sc = new Scanner(System.in);
	static int elem;
	static int flag=0;
	public static void main(String[] args) {

			int arr[] = {45,19,7,2,1,33,87,92,10,33,45,67,34,56,134,67,35,67};
			
			//User input from console.
//			for(int i=0; i<arr.length; i++){
//				System.out.println("Enter element "+(i+1)+" in the array: ");
//				arr[i] = sc.nextInt();
//			}
			
			// To display the elements in the array.
			System.out.print("Element in the array: { ");
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+"  ");
			}
			System.out.print("}");
			System.out.println("\nEnter element to be searched in the array: ");
			elem = sc.nextInt();
			
			//Sorting the array
			Arrays.sort(arr); 
			
			//Displaying the sorted array in ascending order
			System.out.print("Elements of array sorted in ascending order: { ");  
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+"  ");
			}
			System.out.print("}");
			System.out.print("Array Size: "+arr.length);
			
			int first=0, last=arr.length;
			
			//Binary Search algorithm
			int mid;
			mid = (first+last)/2;
			while(first <= last){
				if(elem>arr[mid]){


				}
				if(elem<arr[mid]){
					System.out.print("\nLeft side");
				}
				else
					System.out.print("\nMiddle");
			}
			
			

	}


}


