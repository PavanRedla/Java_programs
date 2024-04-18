package p1;

public class AClass 	// Outer Abstract Class
{
	public class SubClass2		// Instance Member InnerClass
	{
		public void m2(int y)
		{
			System.out.println("***m2(2)***");
			System.out.println("The value y: "+y);			
		}
	}
	
	public static class SubClass3  		// Static Member InnerClass
	{
		public void m3(int z)
		{
			System.out.println("***m3(z)***");
			System.out.println("The value z: "+z);			
		}
	}

}
