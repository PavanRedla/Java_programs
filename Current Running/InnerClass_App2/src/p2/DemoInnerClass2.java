package p2;
import p1.*;
import java.util.Scanner;

public class DemoInnerClass2 
{
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Read data for OuterClass Variables:");
		System.out.println("Enter the value for a: ");
		int a = s.nextInt();
		System.out.println("Enter the value for b: ");
		int b = s.nextInt();
		
		SubClass1 ob1 = new SubClass1(a,b);  // OuterClass_Object
		ob1.m1();  // Outer_Class Instance method call
		
		System.out.println("Read data for InnerClass Variables:");
		System.out.println("Enter the value for x: ");
		int x = s.nextInt();
		System.out.println("Enter the value for y: ");
		int y = s.nextInt();
		
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2(x, y);  // Static Member InnerClass Object
		ob2.m2();   // InnerClass Instance Method Call
		SubClass1.SubClass2.m22();   // Inner Class static method call
		
		s.close();
	}

}
