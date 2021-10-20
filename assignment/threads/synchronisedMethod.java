package assignment.threads;

class operations{
	synchronized void factorial(int n1){
		int f = n1;
		for(int a=1; a <= (f-1); a++){
			n1=n1*a;
		}
		try{
			Thread.sleep(400);
		} 
		catch(Exception E){
			System.out.println(E);
		}
		System.out.println("Factorial of "+f+" = "+n1+" ::: "+Thread.currentThread().getName());
	}
	synchronized void addition (int n2, int n3){
		try{
			Thread.sleep(400);
		}
		catch(Exception E){
			System.out.println(E);
		}
		System.out.println("Addition of "+n2+"+"+n3+" = "+(n2+n3)+" ::: "+Thread.currentThread().getName());
	}
	
}
class thread1 extends Thread{
	operations ops;
	thread1 (operations ops){
		this.ops=ops;
	}
	public void run(){
		ops.factorial(4);
	}
}
class thread2 extends Thread{
	operations ops;
	thread2 (operations ops){
		this.ops=ops;
	}
	public void run(){
		ops.factorial(6);
	}
}
class thread3 extends Thread{
	operations ops;
	thread3 (operations ops){
		this.ops=ops;
	}
	public void run(){
		ops.addition(4,5);
	}
}
class thread4 extends Thread{
	operations ops;
	thread4 (operations ops){
		this.ops=ops;
	}
	public void run(){
		ops.addition(20,10);
	}
}

public class synchronisedMethod {
	
	public static void main(String args[]){
		final operations ops = new operations();
		
		thread1 T1 = new thread1(ops);
		thread2 T2 = new thread2(ops);
		thread3 T3 = new thread3(ops);
		thread4 T4 = new thread4(ops);
		
		//Sequence as per question's demand
		T2.setName("Print 1st ---> T2");
		T4.setName("Print 2nd ---> T4");
		T1.setName("Print 3rd ---> T1");
		T3.setName("Print 4th ---> T3");
		
		T2.start();
		T4.start();
		T1.start();
		T3.start();
	}
}














