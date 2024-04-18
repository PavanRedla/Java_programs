package p1;

public interface ITest     // Outer Interface
{
	public static class SubClass1  		//Static Member InnerClass
	{
		public void m1(int x)
		{
			System.out.println("***m1(x)***");
			System.out.println("The value x: "+x);			
		}
	}
}
