package p2;
import p1.*;

public class DemoInheritance1 
{
	public static void main(String args[])
	{
		B ob = new B();
		
		ob.m1();
		B.m2();
		ob.dis1();
		B.dis2();
	}
}
