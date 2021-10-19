package assignments.oops;

public class fountainPen extends Pen{
	public void changeNib(){
		System.out.println("Change Nib in Fountain Pen");
	}
	public void write(){
		System.out.println("Write with Fountain Pen");
	}
	public void refill(){
		System.out.println("Refill the Fountain Pen");
	}
	public static void main(String[] args) {
		new fountainPen().changeNib();
		new fountainPen().write();
		new fountainPen().refill();

	}

}
