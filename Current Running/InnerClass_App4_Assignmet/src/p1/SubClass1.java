package p1;
import java.util.Scanner;


public class SubClass1   // Outer Class
{
	public SubClass1(int a, int b)
	{
		this.a=a;
		SubClass1.b = b;
	}
	public int a;
	public static int b;
	
	public class SubClass2  // Instance Member InnerClass
	{
		public SubClass2(int x, int y)
		{
			this.x =x;
			SubClass2.y = y;
		}
		
		public int x;
		public static int y;
		
		public void m2() 
		{
			System.out.println("Instance Member InnerClass Instance Method m2()");
			System.out.println("The value x: "+x);
			System.out.println("The value y: "+y);
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
		
		public static void m22() 
		{
			System.out.println("Instance Member InnerClass Static Method m22()");
			//System.out.println("The value x: "+x);
			System.out.println("The value y: "+y);
			//System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
		}
	}
	
	public void m1()  // Outer Class Instance Method
	{
		System.out.println("Outer Class Method m1()");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
		
		class SubClass3   // Local Member InnerClass
		{
			public int p;
			public static int q;
			
			public SubClass3(int p, int q)
			{
				this.p = p;
				SubClass3.q = q;
			}
		
			public void m3()
			{
				System.out.println("Local Member InnerClass Instance Method m3()");
				System.out.println("The value p: "+p);
				System.out.println("The value q: "+q);
				System.out.println("The value a: "+a);
				System.out.println("The value b: "+b);
			}
			
			public static void m33()
			{
				System.out.println("Local Member InnerClass static Method m33()");
				//System.out.println("The value p: "+p);
				System.out.println("The value q: "+q);
				//System.out.println("The value a: "+a);
				System.out.println("The value b: "+b);
			}
			
		}
		
		Scanner s = new Scanner(System.in);
		System.out.println("Read Local Member Inner Class data");
		System.out.println("Enter the value for p: ");
		int p = s.nextInt();
		System.out.println("Enter the value for q: ");
		int q = s.nextInt();
		
		SubClass3 ob3 = new SubClass3(30,300); // Local Member InnerClass Object
		
		ob3.m3();
		SubClass3.m33();
	}
	

}













