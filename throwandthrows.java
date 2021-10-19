import java.util.Scanner;

public class throwandthrows {
	//Throw exception if number 1 is greater than 900
    static int add(int num1, int num2) { // static method
      if (num1 > num2){
         throw new NullPointerException("IO Exception");
      }
      if (num1 < num2){
    	  throw new ArithmeticException("IO Exception");
      }
      else
      return num1+num2;
    }

	public static void main(String[] args) {
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int num2 = scanner.nextInt();
		
		try{
			result = add(num1, num2);
		}
		catch(NullPointerException np)
	       {
	    	   System.out.println(np.getMessage());
	       }
		catch(ArithmeticException ae)
	       {
	    	   System.out.println(ae.getMessage());
	       }
	       
	       System.out.println("Result is : "+result);

	}

}
