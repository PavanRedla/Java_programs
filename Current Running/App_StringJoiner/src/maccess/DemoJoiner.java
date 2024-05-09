package maccess;
import java.util.*;

public class DemoJoiner
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the number of String to be added to StringJoiner: ");
				int n = Integer.parseInt(s.nextLine());
				System.out.println("Enter the delimiter to join the string in StringJoiner: ");
				String dl = s.nextLine();
				StringJoiner sj = new StringJoiner(dl);
				System.out.println("Enter "+n+" Strings: ");
				for(int i=1;i<=n;i++)
				{
					sj.add(s.nextLine());
				}
				System.out.println("---Display StringJoiner---");
				System.out.println(sj.toString());
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
