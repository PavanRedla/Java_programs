package p1;

public class B extends A {
	public static int b = 100;
		
	{    // Non-static block
		a++;
		b++;
		System.out.println("Child class Instance block");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}
	
	static	
	{     		// Static block
		a++;
		b++;
		System.out.println("Child class Static block");
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
	}

}
