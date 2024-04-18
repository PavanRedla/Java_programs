package p2;
import p1.*;
import java.util.*;

public class DemoLambdaExpression3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value-1: ");
		float v1 = s.nextFloat();
		
		System.out.println("Enter the value-2: ");
		float v2 = s.nextFloat();
		
		System.out.println("Enter the choice\n\t1.Add\n\t2.Sub\n\t3.Mul\n\t4.Div\n\t5.ModDiv");
		int choice = s.nextInt();
		
		IArithmetic ob = Access.getRef(choice);
		
		if (ob==null)
		{
			System.out.println("Invalid Choice");
		}
		else
		{
			float res = ob.calculate(v1, v2);
			System.out.println("Result is :"+res);
		}	
		s.close();
	}

}
