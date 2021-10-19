package assignment.modifier.p2;

import assignment.modifier.p1.*;

public class Y extends N{

	public static void main(String[] args) {
		/* ----- Variables of Class X ------ */
		
		System.out.println("\nVariable of Class X");
		System.out.println("X private int " + new X().buffer());
		System.out.println("X default long " + new X().hat);
		System.out.println("X protected float " + new X().ink);
		System.out.println("X public char " + new X().jet);
		
		/*---- Methods of Class M-------*/
		System.out.println("\nMethods of Class M");
		new Y().buffer3();

		
		/*---- Methods of Class N-------*/
		System.out.println("\nMathods of Class N");
		Y dog = new Y();
		dog.dog();
		
		N egg = new N();
		egg.egg();
		//new N().egg();
	}
	
}
