package p1;

public interface ITest2 
{
	public abstract void m1(int x);
	
	public static void m2(int y)
	{
		System.out.println("ITest2 Static Concrete Method");
		System.out.println("The Value y: "+y);
	}
	
	public default void m33(int z)
	{
		System.out.println("ITest2 Default Concrete Method");
		System.out.println("The Value z: "+z);
	}

}
