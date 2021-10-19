package Inheritance.p1;

public class singleLevelInheritance extends Teacher{
	String mainSubject = "Physics";
	
	public static void main(String[] args) {
		singleLevelInheritance obj = new singleLevelInheritance();
		
		System.out.println(obj.getCollegeName());
		System.out.println(obj.getDesignation());
		System.out.println(obj.mainSubject);
		obj.does();

	}

}
