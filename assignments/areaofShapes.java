package assignments;

public class areaofShapes {
	float side,length,breadth;
	int radius;
	
	public static void main(String[] args) {
		areaofShapes square = new areaofShapes(5f);
		areaofShapes circle = new areaofShapes(8);
		areaofShapes rectangle = new areaofShapes(9.5f, 8.3f);
		
		System.out.println("Area of Square: "+square.Square() +" units");
		System.out.println("Area of Circle: "+circle.Circle() +" units");
		System.out.println("Area of Rectangle: "+rectangle.Rectangle() +" units");
		System.out.println("Area of Rhombus: "+ new areaofShapes().Shapes(5,8) +" units");
		System.out.println("Area of Triangle: "+new areaofShapes().Shapes(4.6f,8) +" units");
	}
	
	public areaofShapes(){
		
	}
	
	//area of Square
	public areaofShapes(float side){
		this.side=side;
	}
	
	//area of Circle
	public areaofShapes(int radius){
		this.radius=radius;
	}
	
	//area of Rectangle
	public areaofShapes(float length, float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	//Display method
	public float Square(){
		return(side*side);
	}
	public double Circle(){
		return (3.14*radius*radius);
	}
	public float Rectangle(){
		return (length*breadth);	
	}
	//For Rhombus and Triangle
	public float Shapes(int d1, int d2){
		return d1*d2/2;
	}
	public float Shapes(float h, int b){
		return h*b/2;
	}
}
