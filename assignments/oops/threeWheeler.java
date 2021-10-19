package assignments.oops;

public class threeWheeler extends Vehicle{
	public int speed = 30;
	public long distance = 300l;
	public int nos_of_tyre = 3;
	
	public void run(){
		System.out.println("Run 3 Wheeler");
	}
	public void stop(){
		System.out.println("Stop 3 Wheeler");
	}
	
	public threeWheeler() {
		
	}
	public void display(){
	System.out.println("Varible of 2W: "+speed);
	System.out.println("Varible of 2W: "+distance);
	System.out.println("Varible of 2W: "+nos_of_tyre);
	System.out.println("Varible of 2W: "+super.speed);
	System.out.println("Varible of 2W: "+super.distance);
	}
}
