import java.util.*;
public class practiceStack {
	

	public static void main(String[] args) {
		Stack S1 = new Stack();
		
		S1.push("Swapnil");
		S1.push("Mahima");
		S1.push("Ashish");
		S1.push("Jay");
		S1.push("Pratee");
		S1.push(35);
		S1.push(22);
		S1.push(06);
		S1.push(1996.11f);
		S1.push(1996.01f);
		
		System.out.println("Display Stack: "+S1);
		
		for(int i=0; i<=1; i++){
			S1.pop();
		}
		System.out.println("Display Stack: "+S1);
		
		System.out.println("Peek: "+S1.peek());
			
			
	}

}
