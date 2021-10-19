package assignment.collections;

import java.util.*;

public class linkedHasSet {
	

	public static void main(String[] args) {
		LinkedHashSet L1 = new LinkedHashSet();
		
		L1.add(5);
		L1.add(7);
		L1.add(5.5f);
		L1.add(true);
		L1.add(9.5f);
		L1.add('A');
		L1.add('a');
		System.out.println(L1);	
		
		LinkedHashSet<Integer> L2 = new LinkedHashSet();
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Enter value: ");

	    String userName = sc.nextLine();  
	    		
	}

}
