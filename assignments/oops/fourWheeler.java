package assignments.oops;

public class fourWheeler extends Vehicle{
	public int speed = 40;
	public long distance = 400l;
	public int nos_of_tyre = 4;
	
	public void run(){
		System.out.println("Run 4 Wheeler");
	}
	public void stop(){
		System.out.println("Stop 4 Wheeler");
	} 
	
	public fourWheeler() {
		
	}
	public void display(){
	System.out.println("Varible of 2W: "+speed);
	System.out.println("Varible of 2W: "+distance);
	System.out.println("Varible of 2W: "+nos_of_tyre);
	System.out.println("Varible of 2W: "+super.speed);
	System.out.println("Varible of 2W: "+super.distance);
	}
	
}
