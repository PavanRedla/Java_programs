package p1;

public class B extends A {
	public int x=100;
	public static int y = 200;
	
	public void dis1()
	{
		System.out.println("***Child class Instance dis1()***");
		System.out.println("The value of x: "+x);
		System.out.println("The value of y: "+y);
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	
	public static void dis2()
	{
		System.out.println("***Child class Static dis2()***");
		//System.out.println("The value of x: "+x);
		System.out.println("The value of y: "+y);
		//System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
}
