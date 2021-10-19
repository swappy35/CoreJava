package assignments.oops;

public class eightWheeler extends Vehicle {
	public int speed = 80;
	public long distance = 800l;
	public int nos_of_tyre = 8;
	
	public void run(){
		System.out.println("Run 8 Wheeler");
	}
	public void stop(){
		System.out.println("Stop 8 Wheeler");
	} 
	
	public eightWheeler() {
		
	}
	public void display(){
	System.out.println("Varible of 8W: "+speed);
	System.out.println("Varible of 8W: "+distance);
	System.out.println("Varible of 8W: "+nos_of_tyre);
	System.out.println("Varible of 8W: "+super.speed);
	System.out.println("Varible of 8W: "+super.distance);
	}
}
