package macess;
import java.util.*;

public class DemoString
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the no. of Integer elements:");
				int n = s.nextInt();
				Integer a[] = new Integer[n];
				ArrayList<Integer> al = new ArrayList<Integer>();
				System.out.println("Enter "+n+ " elements: ");
				for(int i=0; i<n; i++)
				{
					@SuppressWarnings("removal")
					Integer ob = new Integer(s.nextInt());
					a[i] = ob;
					al.add(ob);
				}
				System.out.println("---Array before sorting---");
				for(Integer k: a)
				{
					System.out.print(k.toString()+" ");
				}
				System.out.println("\n---ArrayList before sorting---");
				al.forEach((k)->
				{
					System.out.print(k.toString()+" ");
				});
				Arrays.sort(a); // sorting process on Array object
				Collections.sort(al);  // sorting process on List object
				System.out.println("\n---Array after sorting---");
				for(Integer k: a)
				{
					System.out.print(k.toString()+" ");
				}
				System.out.println("\n---ArrayList after sorting---");
				al.forEach((k)->
				{
					System.out.print(k.toString()+" ");
				});
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}
