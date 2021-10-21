package assignment.collections;

import java.util.*;

public class linkedHasSet {
	

	public static void main(String[] args) {
		/*		L1. 
		 * 		1st object will be generic 
		 * 		( add two int, two float ,two char, one boolean)
		 */
		LinkedHashSet L1 = new LinkedHashSet();
		L1.add(5);
		L1.add(7);
		L1.add(5.5f);
		L1.add(true);
		L1.add(9.5f);
		L1.add('A');
		L1.add('a');
		System.out.println(L1);
		
		/*		L2. 
		 * 		2nd object will be be Integer type only and add the number from user console
		 *		in random order (1 to 8).
		 */
		
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);  
		for(int i=1;i<=8;i++){
			System.out.println("Enter value "+i+" : ");  
			L2.add(sc.nextInt());
		}	
		System.out.println(L2);
		
	}

}
