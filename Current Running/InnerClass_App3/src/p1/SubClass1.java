package p1;

public class SubClass1  // Outer Class
{
	public int a = 10;
	public static int b = 20;
	
	public class SubClass2  // Instance Member InnerClass
	{
		public int x = 100;
		public static int y = 200;
		
		// (i)Instance member InnerClasses can be declared with both 'static'; and 'NonStatic members.
		
		public void m2()
		{
			System.out.println("Instance Member InnerClass Instance Method m2()");
			System.out.println("The value x: "+x);
			System.out.println("The value y: "+y);
			System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
			
			//(ii)Instance methods of Instance Member InnerClasses can access all the members of
			//OuterClass directly,because InnerClass Object will hold the reference of OuterClass
			//Object.
		}
		
		public static void m22()
		{
			System.out.println("Instance Member InnerClass Static Method m22()");
			//System.out.println("The value x: "+x);
			System.out.println("The value y: "+y);
			//System.out.println("The value a: "+a);
			System.out.println("The value b: "+b);
			
			//(iii)Static methods of Instance Member InnerClasses can access only static member of
			//OuterClass and InnerClass.
		}
	}
		
	public void m1()  // OuterClass Instance Method
	{
		System.out.println("Outer Class Instance method m1()");
		System.out.println("The value a: "+a);
		System.out.println("The value b: "+b);
		
		class SubClass3  // Local Member Inner Class
		{
			public int p = 30;
			public static int q = 300;
			
			public void m3()
			{
				System.out.println("Local Member Inner Class Instance Method m3()");
				System.out.println("The value p: "+p);
				System.out.println("The value q: "+q);
				System.out.println("The value a: "+a);
				System.out.println("The value b: "+b);
				
				// The Local member InnerClasses which are declared inside the Instance methods will 
				// have behaviour like Instance member InnerClasses.
			}
			
			public static void m33()
			{
				System.out.println("Local Member Inner Class Static Method m33()");
				//System.out.println("The value p: "+p);
				System.out.println("The value q: "+q);
				//System.out.println("The value a: "+a);
				System.out.println("The value b: "+b);
				
				// The Local member InnerClasses which are declared inside the static methods will 
				// have behaviour like static member InnerClasses.
			}
		}
			
		SubClass3 ob3 = new SubClass3();
			
		// Local Member InnerClass Object is created inside the method where the class is declared.
			
		ob3.m3();
		SubClass3.m33();
	}	
}