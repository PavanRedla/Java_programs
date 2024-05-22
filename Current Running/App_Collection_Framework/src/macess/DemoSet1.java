package macess;
import java.util.*;

public class DemoSet1
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Set<Integer> ob = null;
				String nm = null;
				System.out.println("---Enter the Choice---");
				switch(s.nextInt())
				{
				case 1:
					ob = new HashSet<Integer>();
					nm = "HashSet";
					break;
				case 2:
					ob = new LinkedHashSet<Integer>();
					nm = "LinkedHashSet";
					break;
				case 3:
					ob = new TreeSet<Integer>();
					nm = "TreeSet";
					break;
				default:
					System.out.println("Invalid Choice...");
					System.exit(0);
				}
				System.out.println("Enter the number of elements to be added to "+nm);
				int n = s.nextInt();
				System.out.println("Enter "+n+ "Elements: ");
				for(int i = 1; i<=n;i++)
				{
					ob.add(new Integer(s.nextInt()));
				}
				System.out.println("---Display elements from "+nm+"---");
				System.out.println(ob.toString());
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
