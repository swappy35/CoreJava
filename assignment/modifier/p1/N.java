package assignment.modifier.p1;

public class N {
	protected long dog()
	{
		System.out.println("Protected of N");
		return 1;
	}
	
	public int egg()
	{
		System.out.println("Public of N");
		fish();
		return 1;
	}
	double fish()
	{
		System.out.println("Default of N");
		return 1.0;
	}
	protected void buffer3(){
		new M().cat();
	}
}
