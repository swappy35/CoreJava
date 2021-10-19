
public class execptionHandling {


	public static void main(String[] args) {
		try{
			int a;
			a = 10/0;
			System.out.println("A: "+a);
		}
		catch(ArithmeticException AE){
			System.err.println("Error: "+AE.getMessage());
		}
		finally{
			System.out.println("Rest of the Code");
			
		}

	}

}