package p1;

public interface ITest1 
{
	public abstract void m1(int x);
	
	public static void m2(int y)
	{
		System.out.println("ITest1 Static Concrete Method");
		System.out.println("The Value y: "+y);
	}
	
	public default void m3(int z)
	{
		System.out.println("ITest1 Default Concrete Method");
		System.out.println("The Value z: "+z);
	}

}
