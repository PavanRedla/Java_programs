package p1;

public class A {
	public int a=10;
	public static int b = 20;
	
	public void m1()
	{
		System.out.println("***Parent class Instance m1()***");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	
	public static void m2()
	{
		System.out.println("***Parent class Static m1()***");
		//System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
}
