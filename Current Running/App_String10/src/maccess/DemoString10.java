package maccess;
import java.util.*;
public class DemoString10 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the string-1: ");
			String s1 = s.nextLine().trim();
			System.out.println("Enter the string-2: ");
			String s2 = s.nextLine().trim();
			
			System.out.println("--- compareTo()---");
			int p = s1.compareTo(s2);
			
			if(p==0)
			{
				System.out.println("Strings are equal");
			}
			else if(p>0) 
			{
				System.out.println(s1+ " is greater than "+s2);
			}
			else
			{
				System.out.println(s1+ " is less than "+s2);
			}
			
			System.out.println("--- compareToIgnoresCase()---");
			int q = s1.compareToIgnoreCase(s2);
			
			if(q==0)
			{
				System.out.println("Strings are equal");
			}
			else if(q>0) 
			{
				System.out.println(s1+ " is greater than "+s2);
			}
			else
			{
				System.out.println(s1+ " is less than "+s2);
			}
		}
	}

}
