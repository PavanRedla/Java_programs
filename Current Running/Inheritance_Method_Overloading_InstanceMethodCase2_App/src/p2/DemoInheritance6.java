package p2;
import java.util.Scanner;
import p1.*;

public class DemoInheritance6 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		CClass ob = new CClass(); // Child class object
		System.out.println("Enter the value of x:");
		int x = s.nextInt();
		System.out.println("Enter the value of y:");
		int y = s.nextInt();
		float res = ob.calculate(x, y);
		System.out.println("Result: "+res);
		s.close();
	}

}
