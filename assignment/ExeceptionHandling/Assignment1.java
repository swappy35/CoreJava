package assignment.ExeceptionHandling;

public class Assignment1 {
		static void validate(int salary)throws InvalidAgeException{  
		     if(salary<=2100)  
		      throw new InvalidAgeException("You need to work hard"); 
		     if(salary<=5000)  
			  throw new InvalidAgeException("Your salary is somehow good");
		     else  
		      System.out.println("Salary is very good");  
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		        validate(2200);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
		  
		      System.out.println("rest of the code...");  
		  }  	
}
//This class is created for your own defined exception message
class InvalidAgeException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidAgeException(String s){  //2
	  super(s);  
	 }  
} 