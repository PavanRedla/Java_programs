package p1;

public class A {
	public static int a = 10;
	
	{    // Non-static block
		a++;
		System.out.println("Parent class Instance block");
		System.out.println("The value of a: "+a);
	}
	
	static	
	{     		// Static block
		a++;
		System.out.println("Parent class Static block");
		System.out.println("The value of a: "+a);
	}

}
