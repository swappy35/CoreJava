package practice;

public class practiceBubbleSort {

	public static void main(String[] args) {
		int arr[] = {73,19,2,5,13,80,11,45,100};
		
		//Bubble sort
		for (int j=0; j<(arr.length-1); j++){
			for(int i=0; i<(arr.length-i-1); i++){
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		System.out.print("Sorted element in the array: { ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.print("}");
	}

}
