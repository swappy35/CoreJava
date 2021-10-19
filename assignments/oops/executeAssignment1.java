package assignments.oops;

public class executeAssignment1 {

	public static void main(String[] args) {
		Vehicle W;
		// 2 wheeler
		W = new twoWheeler();
		W.display();			// call all the methods using dynamic/runtime polymorphism here
		W.run();				// Calling methods of all child classes
		W.stop();				// Calling methods of all child classes
		// 3 wheeler
		W = new threeWheeler();
		W.display();			// call all the methods using dynamic/runtime polymorphism here
		W.run();				// Calling methods of all child classes
		W.stop();				// Calling methods of all child classes
		// 4 wheeler
		W = new fourWheeler();
		W.display();			// call all the methods using dynamic/runtime polymorphism here
		W.run();				// Calling methods of all child classes
		W.stop();				// Calling methods of all child classes
		// 8 wheeler
		W = new eightWheeler();
		W.display();			// call all the methods using dynamic/runtime polymorphism here
		W.run();				// Calling methods of all child classes
		W.stop();				// Calling methods of all child classes

		// call all the methods of the fuel of Vehicle class
		W.fuel(1);
		W.fuel(5f, "SP");
		W.fuel('C', 2);
		
//		// Calling methods of all child classes
//		// 2 Wheeler methods
//		twoWheeler W2 = new twoWheeler();
//		W2.run();
//		W2.stop();
//		// 3 Wheeler methods
//		threeWheeler W3 = new threeWheeler();
//		W3.run();
//		W3.stop();
//		// 4 Wheeler methods
//		fourWheeler W4 = new fourWheeler();
//		W4.run();
//		W4.stop();
//		// 8 Wheeler methods
//		eightWheeler W8 = new eightWheeler();
//		W8.run();
//		W8.stop();

	}


}
