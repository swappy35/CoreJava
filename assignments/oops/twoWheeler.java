package assignments.oops;

public class twoWheeler extends Vehicle{
	public int speed = 20;
	public long distance = 200l;
	int nos_of_tyre = 2;
	
	public void run(){
		System.out.println("Run 2 Wheeler");
	}
	public void stop(){
		System.out.println("Stop 2 Wheeler");
	}
	
	public twoWheeler() {
		
	}
	public void display(){
	System.out.println("Varible of 2W: "+speed);
	System.out.println("Varible of 2W: "+distance);
	System.out.println("Varible of 2W: "+nos_of_tyre);
	System.out.println("Varible of 2W: "+super.speed);
	System.out.println("Varible of 2W: "+super.distance);
	}
	
}
