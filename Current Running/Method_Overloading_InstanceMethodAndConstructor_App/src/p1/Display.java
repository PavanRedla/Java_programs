package p1;

public class Display {
	public Display(int x, int y)
	{
		this(x);
		System.out.println("***Display(x,y)***");
		System.out.println("The value x: "+x);
		System.out.println("The value y: "+y);
	}
	
	public Display(int x)
	{
		System.out.println("***Display(x)***");
		System.out.println("The value x: "+x);
	}
	
	public void m(int a, int b)
	{
		this.m(a);
		System.out.println("***m(a,b)***");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	
	public void m(int a)
	{
		System.out.println("***m(a)***");
		System.out.println("The value a: "+a);
	}
}
