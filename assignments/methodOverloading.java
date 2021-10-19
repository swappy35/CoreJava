package assignments;

public class methodOverloading {

	public static void main(String[] args) {
		System.out.println("ADD = " +new methodOverloading().calculate(5, 6));
		System.out.println("Area of Circle = " +new methodOverloading().calculate(5.5f));
		System.out.println("Area of Rectangle = " +new methodOverloading().calculate(5.2f, 6.5f));

	}
	public int calculate(int n1, int n2){
		int add = n1+n2;
		return add;
	}
	
	public float calculate(float n4){
		float area1 = (float) (3.14*n4*n4);
		return area1;
	}
	
	public int calculate(float n5, float n6){
		int area2 = (int) ((int)n5*n6);
		return area2;
	}

}
