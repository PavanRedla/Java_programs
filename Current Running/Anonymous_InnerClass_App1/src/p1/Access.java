package p1;

public class Access 
{
	public PClass getRef()
	{
		PClass ob = new PClass() 
		{
			public void m1(int x)
			{
				System.out.println("Anonymous CClass m1(x)");
				System.out.println("The value x: "+x);
			}
			public void m3(int z)
			{
				System.out.println("PClass m3(z)");
				System.out.println("The value z: "+z);
			}
		};
		return ob;
	}
}
