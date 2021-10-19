import java.util.*;

public class practiceDeQueue {
	ArrayList<Integer> AL = new ArrayList<Integer>();
	
	void insertFront(int n){
		System.out.println("Inserting at Front: "+n);
		AL.add(0,n);
		System.out.println(AL);
	}
	void InsertRare(int n){
		System.out.println("Inserting at Rare: "+n);
		AL.add(n);
		System.out.println(AL);
	}
	public static void main(String[] args) {
		

	}

}
