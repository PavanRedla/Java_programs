package maccess;
import java.util.*;
public class DemoArray3 
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int sum = 0;
		try(s;)
		{
			try
			{
				System.out.println("Enter the number of Integer values: ");
				int n = s.nextInt();
				Integer a[] = new Integer[n];
				System.out.println("Enter "+n+" Integer values: ");
				for(int i=0;i<a.length;i++)
				{
					a[i] = new Integer(s.nextInt());
				}
				for (int i=0;i<a.length;i++)
				{
					sum = sum + a[i];
				}
				System.out.println("Sum of values from Array: "+sum);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
