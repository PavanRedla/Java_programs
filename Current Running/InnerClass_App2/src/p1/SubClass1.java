package p1;

public class SubClass1  // Outer_Class
{
	public int a;
	public static int b;
	
	// (i)static member InnerClasses can be declared with both static and NonStatic members.
	
	public SubClass1(int a , int b)
	{
		this.a= a;
		SubClass1.b =b;
	}
	
	public void m1()
	{
		System.out.println("Outer Class Instance Method m1()");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
	}
	
	public static class SubClass2   // Static Member Inner_Class
	{
		public int x;
		public static int y;
		
		public SubClass2(int x, int y)
		{
			this.x = x;
			SubClass2.y = y;
		}
		
		public void m2()
		{
			System.out.println("Static Member InnerClass Instance method m2()");
			System.out.println("The Value x: "+x);
			System.out.println("The Value y: "+y); 
			System.out.println("OuterClass Static Variable b: "+b);
			// System.out.println("OuterClass Instance Variable a "+a);
			
			//(ii)Instance methods of Static member InnerClasses can access static members of
			//OuterClass directly,but cannot access Instance members of OuterClass. It can access both 
			// static and non static members of Inner class
		}
		
		public static void m22()
		{
			System.out.println("Static Member InnerClass static method m22()");
			// System.out.println("The Value x: "+x);
			System.out.println("The Value y: "+y); 
			System.out.println("OuterClass Static Variable b: "+b);
			// System.out.println("OuterClass Instance Variable a "+a);
			
			// (iii)Static methods of Static member InnerClasses can access only static members of
			// OuterClass and InnerClass.
		}
	}
}












