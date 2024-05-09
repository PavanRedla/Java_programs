package maccess;
import java.util.*;

public class DemoTokenizer 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String: ");
			String str = s.nextLine();
			StringTokenizer ob = new StringTokenizer(str, " ");
			System.out.println("============================");
			System.out.println("Count of Tokens: "+ob.countTokens());
			System.out.println("---List of Tokens---");
			while(ob.hasMoreTokens())
			{
				String tk = ob.nextToken();
				System.out.println("Token: "+tk.toString());
			}
			System.out.println("============================");
			System.out.println("count of Tokens: "+ob.countTokens());
			System.out.println("---Reverse of words from string---");
			StringTokenizer ob2 = new StringTokenizer(str," ");
			while(ob2.hasMoreTokens())
			{
				String tk = ob2.nextToken();
				StringBuffer sb = new StringBuffer(tk);
				System.out.print(sb.reverse()+" ");
			}
		}
		

	}

}
