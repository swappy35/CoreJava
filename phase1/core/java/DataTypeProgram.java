package phase1.core.java;

public class DataTypeProgram {

	public static void main(String[] args) {
		//----------TYPECAST BETWEEN INT and LONG-----------//
		int i = 100;
		long l = i;       //automatic conversion from int to long
		System.out.println("long value " +l);
		
		int o = (int)l;   //explicit typecast from long to int
		System.out.println("int value " +o);
		
		char t = (char) i;
		System.out.println("char value " +t);
		
		
		//----------TYPECAST BETWEEN DOUBLE and FLOAT-----------//
		double d = 1234567899876.14785236996325874;
		float r = (float)d;       //explicit typecast from double to float
		System.out.println("float value " +r);
		System.out.println("double value " +d);
		
		
		//----------TYPECAST FROM DOUBLE ---> LONG ---> INT in  series--------//
		double d2 = 123455678451244254.3216547898455165523;
		long l2 = (long)d2;       //explicit type casting required
		int i2 = (int)l2;         //explicit type casting required
		System.out.println("Double value " +d2);
		System.out.println("Long value " +l2);
		System.out.println("Int value " +i2);
		
		
		//----------TYPECAST BETWEEN LONG and FLOAT--------//
		float f = l;        //automatic type conversion from long to float
		System.out.println("float value " +f);
		
		
		//----------TYPECAST FROM DOUBLE ---> LONG ---> INT in  series--------//
		byte b;
		int ii = 257;
		double dd = 323.142;
		System.out.println("\nConversion of INT to BYTE");
		b = (byte)ii;     //i%256 will happen
		System.out.println("ii = "+ii + " b = " +b);
		
		System.out.println("\nConversion of DOUBLR to BYTE");

		b = (byte) dd;
		System.out.println("dd = " +dd+ " b = " +b);
	}

}
