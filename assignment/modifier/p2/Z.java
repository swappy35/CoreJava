package assignment.modifier.p2;

import assignment.modifier.p1.*;

public class Z extends M {

	public static void main(String[] args) {
		/* ----- Variables of Class X ------ */
		
		System.out.println("\nVariable of Class X");
		System.out.println("X private int " + new X().buffer());
		System.out.println("X default long " + new X().hat);
		System.out.println("X protected float " + new X().ink);
		System.out.println("X public char " + new X().jet);
		
		/*---- Methods of Class M-------*/
		System.out.println("\nMethods of Class M");
		new Z().cat();
		
		/*---- Methods of Class N-------*/
		System.out.println("\nMethods of Class N");
		new Z().buffer2();
		
		/*---- Methods of Class P-------*/
		System.out.println("\nMethods of Class P");
		new Z().cat();
		new Z().buffer2();
		
	}
	
}
