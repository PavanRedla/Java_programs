package p1;

public interface ITest 
{
	public abstract void m1(int x);
	
	public static void m2(int y)
	{
		System.out.println("Static Concrete Method");
		System.out.println("The value y: "+y);
	}
	
	public default void m3(int z, int a, int b) 
	{
		System.out.println("Default Concrete Method");
		System.out.println("The value z: "+z);
		this.dis1(a);
		ITest.dis2(b);
	}
	
	private void dis1(int a)
	{
		System.out.println("Instance Private Concrete Method");
		System.out.println("The value a: "+a);		
	}
	
	private static void dis2(int b)
	{
		System.out.println("Static Private Concrete Method");
		System.out.println("The value b: "+b);
	}

}
