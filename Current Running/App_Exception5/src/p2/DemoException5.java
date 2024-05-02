package p2;
import p1.*;
import java.util.Scanner;

public class DemoException5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;) // try with resource
		{
			try 
			{
				System.out.println("Enter the value -1: ");
				int v1 = Integer.parseInt(s.nextLine());

				System.out.println("Enter the value -2: ");
				int v2 = Integer.parseInt(s.nextLine());
				
				Calculate c = new Calculate("");
				c.cal(v1, v2);
			}
			catch(NumberFormatException | Calculate ob)  // Java 7
			{
				System.out.println(ob.toString());
			}
		}
		
	}

}
