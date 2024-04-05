package p1;

public class IClass extends PClass implements ITest
{
	public void m2(int b)
	{
		System.out.println("Implemented Method m2(b)");
		System.out.println("The Value b: "+b);
	}
}
