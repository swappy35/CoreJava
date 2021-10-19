package Inheritance.p1;

class Teacher {
	private String designation = "Teacher";
	private String collegeName = "Beginnersbook";
	public String getDesignation() {
		return designation;
	}
	public String getCollegeName() {
		return collegeName;
	}
	protected void setDesignation(String designation) {
		this.designation = designation;
	}
	protected void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	void does(){
		System.out.println("Teaching");
	}
}
