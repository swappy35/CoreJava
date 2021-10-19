package assignments.oops;

public abstract class Vehicle {
	public int speed = 0;
	long distance = 0l;
	
	public abstract void run();
	public abstract void stop();
	
	public void fuel(int a){
		System.out.println("Fuel with int");
	}
    public void fuel(float b, String c){
    	System.out.println("Fuel with float and String");
	}
    public void fuel(char d,int e){
    	System.out.println("Fuel with char and int");
	}
    
	public Vehicle() {
		
	}
	public Vehicle(int speed, long distance) {
		this.speed = speed;
		this.distance = distance;
//		System.out.println("Variable of Vehicle in "
//				+ "Constructor: "+ "\n\t Speed: "
//				+this.speed+" Distance: "+this.distance);
		
	}
	public void display(){
		
	}
	
    
}
