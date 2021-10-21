package assignment.collections;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		TreeSet<String> TS = new TreeSet<String>();
		
		/*		
		 * 		Create one object of treeset and add the any 6 programming 
		 * 		languages in random order
		 */
		TS.add("C");
		TS.add("C++");
		TS.add("Java");
		TS.add("Python");
		TS.add("Node.js");
		TS.add("PHP");
		System.out.println("Tree Set: "+TS+" ::: Tree Size: "+TS.size());
		
		/*
		 * 		remove two languages
		 */
		TS.remove("C");
		TS.remove("Java");
		System.out.println("+++++++ 2 items removed from Tree Set +++++++");
		System.out.println("Tree Set: "+TS+" ::: Tree Size: "+TS.size());
		
		/*
		 * 		add three more after removal
		 */
		TS.add("HTML");
		TS.add("CSS");
		TS.add("JavaScript");
		System.out.println("+++++++ 3 items added to Tree Set +++++++");
		
		/*
		 * 		Check if " Java" is part of your tree set or not
		 */
		System.out.println("Is 'Java' present in Tree Set: "+TS.contains("Java"));
		System.out.println("Tree Set: "+TS+" ::: Tree Size: "+TS.size());
		
		/*
		 * 		remove all the elements from the tree Set and display it
		 */
		TS.removeAll(TS);
		System.out.println("Is Tree Set empty: "+TS.isEmpty());
		System.out.println("Tree Set: "+TS+" ::: Tree Size: "+TS.size());
	}

}
