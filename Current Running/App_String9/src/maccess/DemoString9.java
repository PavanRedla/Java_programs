package maccess;
import java.util.*;
public class DemoString9 
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
			
			System.out.println("--- equals()---");
			boolean k = s1.equals(s2);
			
			if(k)
			{
				System.out.println("Strings are equal");
			}
			else 
			{
				System.out.println("Strings are not equal");
			}
			
			System.out.println("--- equalsIgnoreCase()---");
			boolean z = s1.equalsIgnoreCase(s2);
			
			if(z)
			{
				System.out.println("Strings are equal");
			}
			else 
			{
				System.out.println("Strings are not equal");
			}
		}
	}

}
