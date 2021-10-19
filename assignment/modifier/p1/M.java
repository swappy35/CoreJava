package assignment.modifier.p1;

public class M {
	private int apple()
	{
		System.out.println("Private of M");
		return 1;
	}
	
	long ball()
	{
		System.out.println("Default of M");
		return 1;
	}
	protected float cat()
	{
		apple();
		ball();
		System.out.println("Protected of M");
		return 1;
	}
	protected void buffer2(){
		new N().dog();
		new N().egg();
	}

}
