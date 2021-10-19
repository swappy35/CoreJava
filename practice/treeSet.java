package practice;
import java.util.TreeSet;

public class treeSet {
	
	public static void main(String[] args) {
		TreeSet TS = new TreeSet();
		
		TS.add("abc");
		TS.add("ert");
		TS.add("q");
		TS.add("th");
		TS.add("jfrudh");
		TS.add("s");
		TS.add("xyz");
		
		System.out.println("HasTSet is "+TS);
		System.out.println("Size of HasTSet is "+ TS.size());
		
		System.out.println("Does hasTSet contains this 'u' element  " + TS.contains("u"));		
		System.out.println("is hasTSet empty  " + TS.isEmpty());
		System.out.println("remove the element "+TS.remove("i"));
		
		
	    TS.clear();
	    System.out.println("get class  " +TS.getClass());
		
	    System.out.println("is hasTSet empty  " +TS.isEmpty());

	}

}
