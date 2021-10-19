package assignment.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class patternMatching {
	

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[@]?", "firstname@gmail.com"));
		Pattern.matches("\\s", "");
		String s2 = "swapnil@gmail.com";
		String s3 = "test123prepare@co.edu.com";

	}

}
