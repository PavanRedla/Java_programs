package p1;

public interface ITest 
{
	public abstract void dis1(int a);
	
	public default void dis2(int b)
	{
		System.out.println("default method dis2(b)");
		System.out.println("The value b: "+b);
	}

}
