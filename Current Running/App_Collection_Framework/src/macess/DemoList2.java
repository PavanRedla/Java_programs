package macess;
import java.util.*;
import java.util.function.*;

public class DemoList2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<String> al = new ArrayList<String>();
				System.out.println("Enter the number of Strings:");
				int n = Integer.parseInt(s.nextLine());
				System.out.println("Enter "+n+ " Strings...");
				for(int i =0; i<n; i++)
				{
					al.add(new String(s.nextLine()));
				}
				System.out.println("---List of Strings---");
				System.out.println(al.toString());
				// Predicate
				
				Predicate<String> pr = (x)->
				{
					int len = x.length();
					char ch = x.charAt(len-1);
					return switch(ch)
							{
								case 'A': yield true;
								case 'a': yield true;
								case 'E': yield true;
								case 'e': yield true;
								case 'I': yield true;
								case 'i': yield true;
								case 'O': yield true;
								case 'o': yield true;
								case 'U': yield true;
								case 'u': yield true;
								default: yield false;
							};
				};
				
				System.out.println("---String ended with vowels---");
				Spliterator<String> sp = al.spliterator();
				sp.forEachRemaining((k)->
				{
					if(pr.test(k))
					{
						System.out.println(k.toString());
					}
				});
				
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}
