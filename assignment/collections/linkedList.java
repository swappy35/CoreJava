package assignment.collections;

import java.util.*;

public class linkedList {
/*
Assignment 3:
Use LinkedList only in the below program
   - Add 6 months (May, June, July, August, April, November)
   - Add 'December' month as last
   - Add 'January' month as first
   - Add 'March' and then add 'Febuary' using the index based 
   - Add 'Septemeber' and then add 'October' using the index based 
*/

	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<String>();
		
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=1;i<=6;i++){
//			System.out.println("Enter name of month "+i+"/6: ");
//			LL.add(sc.nextLine());
//		}
		LL.add("May");
		LL.add("June");
		LL.add("July");
		LL.add("August");
		LL.add("April");
		LL.add("November");
		
		System.out.println("Name of months entered: "+LL);
		
		LL.addLast("December");
		System.out.println("Adding 'December'");
		System.out.println("Name of months entered: "+LL);
		
		LL.addFirst("January");
		System.out.println("Adding 'January'");
		
		LL.add(1, "February");
		LL.add(2, "March");
		System.out.println("Adding 'February' & 'March' using index");
		System.out.println("Name of months entered: "+LL);
		
		LL.add(8, "September");
		LL.add(9, "October");
		System.out.println("Adding 'September' & 'October' using index");
		System.out.println("Name of months entered: "+LL);
		
		// (1) Print the linkedlist in such a way that proper order of months are displayed
		LL.remove("April");
		LL.add(3, "April");
		
		
		// (2) Get all the even months and print them 
		// (3) Get all the odd months and print them
		LinkedList<String> LL2 = new LinkedList<String>();
		LinkedList<String> LL3 = new LinkedList<String>();
		for(int i=1;i<12;i+=2){
			LL2.add(LL.get(i));
			LL3.add(LL.get(i-1));
		}
		System.out.println("Name of the month at even position (not by index): "+LL2);
		System.out.println("Name of the month at odd position (not by index): "+LL3);
		
		// (4) Use iterator to fetch and print all months
		Iterator<String> ITR = LL.iterator();
		while(ITR.hasNext()){
			System.out.println(ITR.next());
		}
		
		// (5) Print the first and last month of the year together
		System.out.println("First and Last Month: "+LL.getFirst()+" & "+LL.getLast());
		
		// (6) remove your birthday month from the linkedList and print it
		System.out.println("Birthday Month: "+LL.remove(9));
		
		// (7) Check whether this linkedList contains any winter month inside it or not?
		//     taking winter months to be oct,nov,dec and jan.
		boolean b = (LL.contains("October")||LL.contains("November")
					||LL.contains("December")||LL.contains("January"));
		System.out.println("Does LL contains Winter Months: "+b);	
		System.out.println("Name of months entered: "+LL);
	}

}
