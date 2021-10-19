package practice;

public class practiceCustomException {
	public static void compare(int age)throws InvalidAgeException{
		if (age < 18){
			throw new InvalidAgeException("Not Valid");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}

	public static void main(String[] args) {
		try{
			compare(100);
		}
		catch(Exception e){
			System.err.println("Error: "+e.getMessage());
		}
	}
}

class InvalidAgeException extends Exception{

	public InvalidAgeException(String cause) {
		super(cause);
	}
	
}