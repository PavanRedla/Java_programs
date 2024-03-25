package p1;

public class Display {
	public int a;
	public static int b;
	
	public void dis1() {
		System.out.println("***Instance Method dis1()****");
		System.out.println("The value of a is: "+a);
		System.out.println("The value of b is: "+b);
	}
	
	public static void dis2() {
		System.out.println("***Static Method dis2()****");
		System.out.println("The value of b is: "+b);
	}

}
