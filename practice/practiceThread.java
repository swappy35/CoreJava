package practice;

public class practiceThread extends Thread{

	public void run(){
		for(int i=1; i<=5; i++){
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException E){
				System.out.println(E.getMessage());
			}
			System.out.println(Thread.currentThread().getName()+": "+ i);
		}
	}
	
	public static void main(String[] args) {
		practiceThread T1 = new practiceThread();
		T1.setName("Java");
		T1.setPriority(MAX_PRIORITY);
		
		practiceThread T2 = new practiceThread();
		T2.setName("Oracle");
		
		practiceThread T3 = new practiceThread();
		T3.setName("Python");
		
		practiceThread T4 = new practiceThread();
		T4.setName("C++");
		
		practiceThread T5 = new practiceThread();
		T5.setName("Basic");
		T5.setPriority(MIN_PRIORITY);
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();
		
		System.out.println(T1.getState());
		System.out.println(T2.getState());
		System.out.println(T3.getState());
		System.out.println(T4.getState());
		System.out.println(T5.getState());
	}

}
