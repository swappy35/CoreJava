package assignment.ExeceptionHandling;

public class Assignment1 {
		static void validate(int salary)throws SalaryException{  
		     if(salary>=0 || salary<=2100)  
		      throw new SalaryException("You need to work hard"); 
		     if(salary>2100 || salary<=5000)  
			  throw new SalaryException("Your salary is somehow good");
		     if(salary>5000 || salary<=9000)  
		      System.out.println("Salary is very good");  
//		     else
//		    	 System.out.println("Invalid salary entered");  
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		        validate(5000);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }
		  }  	
}

class SalaryException extends Exception{  // 1
	
	SalaryException(String s){  //2
	  super(s);  
	 }  
} 