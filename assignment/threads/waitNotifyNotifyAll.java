package assignment.threads;

class Bank{
	int Balance = 10000;
	
			
	synchronized void Deposit(int D){
		System.out.println("++++++++++++++ Current Balance= "+Balance+" ++++++++++++++");
		System.out.println("Money Deposition in Process...");  
		this.Balance+=D;
		System.out.println("++++++++++++++Deposition Successful+++++++++++++++++"
				+ "\nCurrent Balance= "+this.Balance+" :::::  Amount Deposited= "+D+
				"\n++++++++++++++++++ Visit Again ++++++++++++++++");	
		notifyAll();
	}
	
	synchronized void Withdraw(int W){
		System.out.println("Money Withdrawal in Process...");
		if(this.Balance < W){
			try{
				System.out.println("++++++++++++++ Low Balance, can not withdraw ++++++++++++++"
						+ "\nCurrent Balance= "+this.Balance+
						"\n++++++++++++++ Please Deposit ++++++++++++++");
				wait();
			}
			catch(Exception E){
				System.err.println(E);
			}
		}
		this.Balance-=W;
		System.out.println("++++++++++++++ Withdraw Successful ++++++++++++++"
				+ "\nCurrent Balance= "+this.Balance+" :::::: Amount Withdrawn= "+W+
				"\n++++++++++++++Visit again ++++++++++++++");

	}
}

public class waitNotifyNotifyAll {

	public static void main(String[] args) {
		final Bank B = new Bank();
		
		new Thread(){
			public void run(){
				B.Withdraw(10000);
				B.Withdraw(5000);	
				B.Withdraw(4000);
			}
		}.start();
		
		new Thread(){
			public void run(){
				B.Deposit(20000);	
			}
		}.start();
	}

}
