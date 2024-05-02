package p1;

public class PDisplay 
{
	private int a = 10;
	private static int b = 20;
	
	private PDisplay() {}
	
	public static PDisplay ob = new PDisplay();
	
	private void dis1()
	{
		System.out.println("---dis1()---");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	
	private static void dis2()
	{
		System.out.println("---dis2()---");
		//System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	
	private class SubClass1 	// Instance Member Inner Private Class
	{
		public void m1()
		{
			System.out.println("Private InnerClass m1()");
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
	}
	
	private static class SubClass2 	// Static Member Inner Private Class
	{
		public void m2()
		{
			System.out.println("Private InnerClass m2()");
			//System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
	}
	
	public void access()
	{
		this.dis1();
		PDisplay.dis2();
		
		SubClass1 ob1 = new SubClass1();
		ob1.m1();
		
		SubClass2 ob2 = new SubClass2();
		ob2.m2();
	}
	

}
