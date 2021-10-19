package practice;

public class practiceMultipleTryCatch extends Exception{
	

	public static void main(String[] args) {
		
		try{
			int a[] = new int[5];
			check();
			a[6]=3;
		}
		catch(ArrayIndexOutOfBoundsException EX){
			System.err.println("Error in  1st Try block: "+EX.getMessage());
		}
		finally{
			System.out.println("Rest of the Code");
		}
	}
	public static void check(){
		try{
			int a[] = new int[5];
			a[2] = 10/0;
		}
		catch(ArithmeticException AE){
			System.err.println("Error in 2nd Try block: "+AE.getMessage());
		}
		finally{
			System.out.println("Rest of the Code");
		}
	}

}
