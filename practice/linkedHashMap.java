package practice;
import java.util.*;

public class linkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();
		
		LHM.put(1, "Orange");
		LHM.put(2, "Apple");
		LHM.put(3, "Papaya");
		LHM.put(4, "Banana");
		LHM.put(5, "Grape");
		
		System.out.println("Display: "+LHM);
		for(Integer key : LHM.keySet()){
			System.out.println("Key: "+key+" ::: Value: "+LHM.get(key));
		}
		
		System.out.println("Is Apple present in Map: "+LHM.containsValue("Apple"));
		System.out.println("Is Banana present at 3rd in Map: ");
	}
}