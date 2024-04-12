package p2;
import p1.*;
import java.util.Scanner;

public class DemoInnerClass4
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Read data for Outer Class");
		System.out.println("Enter the value for a: ");
		int a = s.nextInt();
		System.out.println("Enter the value for b: ");
		int b = s.nextInt();
		
		SubClass1 ob1 = new SubClass1(a, b); // Outerclass Object
		ob1.m1();
		
		System.out.println("Read data for Instance Member InnerClass");
		
		System.out.println("Enter the value for x: ");
		int x = s.nextInt();
		System.out.println("Enter the value for y: ");
		int y = s.nextInt();
		
		SubClass1.SubClass2 ob2 = ob1.new SubClass2(x, y);  // Instance Member InnerClass object
		ob2.m2(); // Instance Member Inner Class Instance Method Call
		SubClass1.SubClass2.m22();  // Instance Member InnerClass static Method call
		
	}

}
