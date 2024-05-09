package maccess;
import java.util.*;

public class DemoBuffer3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String: ");
			String str = s.nextLine();
			StringBuffer sb = new StringBuffer(str);
			
			sb.reverse();
			System.out.println("Reverse of String is: "+sb.toString());
			String revStr = sb.toString();
			//String rev = sb.reverse().toString();
			
			if(str.equals(revStr))
			{
				System.out.println(str+ " is a Palindrome String");
			
			}
			else 
			{
				System.out.println(str+ " is Not aPalindrome String");
			}
			
			
		}
	}

}
