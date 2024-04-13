package p1;

public class Access 		// Outer Class
{
	public ITest getRef()  		// OuterClass Instance Method
	{
		ITest ob = new ITest()
		{
			public void dis1(int a)
			{
				System.out.println("Implemented method dis1(a)");
				System.out.println("The value a: "+a);
			}
			
			public void dis3(int c)
			{
				System.out.println("Non-Implemented method dis1(a)");
				System.out.println("The value c: "+c);
			}
		};
		return ob;
	}
}
