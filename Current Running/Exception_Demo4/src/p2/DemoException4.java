package p2;
import java.util.*;
import p1.Calculate;

public class DemoException4 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter the value-1: ");
			int v1 = Integer.parseInt(s.nextLine());

			System.out.println("Enter the value-2: ");
			int v2 = Integer.parseInt(s.nextLine());

			Calculate c = new Calculate("");
			c.cal(v1,v2);
		}
		catch(Calculate ob)
		{
			System.out.println(ob.toString());
		}
		finally
		{
			s.close();
		}
		
	}
}
