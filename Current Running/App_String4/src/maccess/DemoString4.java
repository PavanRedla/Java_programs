// WAP TO READ A STRING AND DISPLAY IN REVERSE, AND ALSO CHECK THE STRING IS PALINDROME STRING OR NOT

package maccess;
import java.util.*;
public class DemoString4 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String: ");
			String str = s.nextLine();
			int len = str.length();
			int count = 0;
			
			System.out.println("---String Reverse---");
			for(int i=len-1; i>=0; i--)
			{
				char ch = str.charAt(i);
				System.out.print(ch);
			}
			
			int j = len-1;
			for(int i = 0; i<=len-1; i++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
				j--;
			}
			
			if(count == len)
			{
				System.out.println("\nPalindrome String");
			}
			else
			{
				System.out.println("\nNot a Palindrome String");
			}
		}
	
	}

}
