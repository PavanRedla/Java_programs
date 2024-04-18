package p2;
import p1.*;
import java.util.Scanner;

public class DemoLambdaExpression2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value-1: ");
		int v1 = s.nextInt();
		System.out.println("Enter the value-2: ");
		int v2 = s.nextInt();
		
		if (v1==v2)
		{
			System.out.println("Values are equal");
		}
		else 
		{
			System.out.println("Choose the choice\n\t1.Greater Value\n\t2.Smaller Value");
			int choice = s.nextInt();
			
			IComparable ob = Access.getRef(choice);
			
			if(ob==null)
			{
				System.out.println("Invalid Choice");
			}
			else
			{
				int res = ob.compareTo(v1,v2);
				System.out.println("Result: "+res);
			}
			
		}		
		s.close();
	}
}
