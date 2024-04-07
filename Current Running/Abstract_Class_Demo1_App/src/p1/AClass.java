package p1;

public abstract class AClass
{
	public abstract void m1(int x);
	public void m2(int y)
	{
		System.out.println("Concrete method m2(y)");
		System.out.println("The value y: "+y);
	}

}
