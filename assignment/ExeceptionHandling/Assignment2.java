package assignment.ExeceptionHandling;

public class Assignment2 {
	public static void main(String[] args) {  
        
        try{    
        	checkedException();
        	int a[]=new int[5];
            a[6]=9;                                                        
        } 
        catch(ArrayIndexOutOfBoundsException e){  
        	System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        }    
        catch(Exception e){  
            System.out.println("Parent Exception occurs");  
        }     
        finally{
     	   System.out.println("rest of the code");
        }
        
	}
	public static void checkedException(){
		try{
			int a[]=new int[5];
			a[3] = 30/0;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception occurs");
		}
        finally{
      	   System.out.println("rest of the code");
         }
	}
}
