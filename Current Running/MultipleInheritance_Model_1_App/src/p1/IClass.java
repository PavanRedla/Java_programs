package p1;

public class IClass implements ITest1,ITest2
{
	public void m1(int x)
	{
		System.out.println("Implemented Method");
		System.out.println("The value x: "+x);
	}
}
