package practice;

public class practiceSelectionSort {

	public static void main(String[] args) {
		int arr[] = {5,13,2,10,7,1};
		
		for(int i=0; i<(arr.length-1); i++){
			int min = i;
			
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[min]){
					min=j;
				}
			}
			int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
			
		}
		System.out.print("Sorted element in the array: { ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.print("}");

	}

}
