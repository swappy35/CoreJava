package assignments.oops;

public class executeAssignment2 {
	
	public static void main(String[] args) {
		MNC_2 MNC = new Hello();
		
		MNC.headOffice();
		MNC.location();
		MNC.normalMethod();
		((Hello) MNC).normalMethod2();
	}
}
