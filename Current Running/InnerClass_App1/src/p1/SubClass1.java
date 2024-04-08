package p1;

public class SubClass1  // Outer_Class
{
	public int a = 10;
	public static int b = 20;
	
	public void m1() 
	{
		System.out.println("Outer Class method m1()");
		System.out.println("The Value a: "+a);
		System.out.println("The Value b: "+b);
	}
	
	public static class SubClass2  // Static Member Inner_Class
	{
		public int x = 100;
		public static int y = 200;
		
		// (i)static member InnerClasses can be declared with both static and NonStatic members.
		
		
		public void m2()
		{
			System.out.println("Static Member InnerClass Instance method m2()");
			System.out.println("The Value x: "+x);
			System.out.println("The Value y: "+y); 
			System.out.println("OuterClass Static Variable b: "+b);
			// System.out.println("OuterClass Instance Variable a "+a);
			
			//(ii)Instance methods of Static member InnerClasses can access static members of
			//OuterClass directly,but cannot access Instance members of OuterClass.
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
