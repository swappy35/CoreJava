package assignment.regex;
import java.util.regex.Pattern;
public class patternMatching {
	

	public static void main(String[] args) {
		//     1. validate the given email id (that should have pattern with @ and .com) 
		System.out.println(Pattern.matches("[\\w]+@[\\w]*[\\.][c][o][m]+?","firstname@gmail.com"));
		System.out.println(Pattern.matches("[\\w]+@[\\w]*[\\.][c][o][m]+?","swapnil@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$","test123prepare@co.edu.com"));
		
		//      2. validate the phone number with country code +91 pattern matching
		System.out.println(Pattern.matches("[\\+][9][1][0-9]{10}","+918547455435"));
		
		/*		3.
		 * 		password with 10 length that should have - first letter caps  / 
		 *		contain 3 digits / contains any number of alphabets also  
		 */
		System.out.println(Pattern.matches("[A-Z]{1}[a-zA-Z]*[0-9]{3}[a-zA-Z]*?","S485lmgrsA"));

	}

}
