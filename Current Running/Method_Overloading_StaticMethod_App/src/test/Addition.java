package test;

public class Addition {
	public static void add(int a, int b)
	{
		System.out.println("***Add(int a,int b)***");
		System.out.println("Sum1: "+(a+b));
	}
	
	public static void add(int a, int b, int c)
	{
		System.out.println("***Add(int a,int b,int c)***");
		System.out.println("Sum2: "+(a+b+c));
	}
	
	public static void add(float a, int b)
	{
		System.out.println("***Add(float a, int b)***");
		System.out.println("Sum3: "+(a+b));
	}
}
