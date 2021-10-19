package assignment.modifier.p1;

public class P {

	public static void main(String[] args) {
		/*
		 * There are two ways to call other class methods in this class
		 * 1. This is for calling method several times:
		 *    <class_name> <object_name> = new <class_name()>;
		 * 	  <object_name>.<method_name>;
		 * 
		 * 2. This is for calling method for once:
		 *    new <class_name>.<method_name>;
		 */
		
		
		//M ball = new M();    //1.
		//ball.ball();
		
		M cat = new M();     //1.
		cat.cat();
		
		new N().dog();       //2.
		
		new N().egg();       //2.
		
		//new N().fish();      //2.
	}	
}
