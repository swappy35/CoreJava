package assignments.oops;

public abstract class MNC {
	public abstract void location();
	public abstract void headOffice();
	
	public MNC(){
		System.out.println("Inside MNC (Constructor)");
	}
	public void normalMethod(){
		System.out.println("Inside MNC (Normal Method)");
	}
	//public void normalMethod2();
}