package assignments;

public class constructorOverloading {
	String name;
	int age;
	char section, gender;
	int sub1=0, sub2=0, sub3=0;
	
	
	public constructorOverloading(String name, int age, char section,
			                      char gender, int sub1, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}
	public constructorOverloading(String name, int age, char section,
			                       char gender, int sub2, int sub3){
		this.name = name;
		this.age = age;
		this.section = section;
		this.gender = gender;
		this.sub2 = sub2;
		this.sub3 = sub3;
		
	}
	
	void display(){
		System.out.println(this.name+" "+this.age+" "+this.section+" "+this.gender+
				           " Total Marks = "+(this.sub1+this.sub2+this.sub3));
	}

	public static void main(String[] args) {
		constructorOverloading S1 = new constructorOverloading("Swapnil", 24, 'A', 'M', 90, 56, 78);
		constructorOverloading S2 = new constructorOverloading("Ajay", 25, 'C', 'M', 56, 67);
		constructorOverloading S3 = new constructorOverloading("Prateek", 23, 'B', 'M', 56, 89);
		constructorOverloading S4 = new constructorOverloading("Mahima", 24, 'A', 'F', 90, 45, 98);
		S1.display();
		S2.display();
		S3.display();
		S4.display();
	}

}
