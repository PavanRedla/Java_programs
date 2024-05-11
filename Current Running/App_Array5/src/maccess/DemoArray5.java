package maccess;
import java.util.*;
public class DemoArray5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Integer a[][] = new Integer[3][3];
				System.out.println("Enter 3x3 Matrix: ");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						a[i][j] = s.nextInt();
					}
				}
				System.out.println("---Display using old for loop---");
				for(int i=0;i<=2;i++)
				{
					for(int j=0;j<=2;j++)
					{
						System.out.print(a[i][j].toString()+" ");
					}
					System.out.println();
				}
				
				System.out.println("---Display using spliterator<T> (Java 8)---");
				
				Spliterator<Integer[]> sp1 = Arrays.spliterator(a);
				
				sp1.forEachRemaining((p)->
				{
					Spliterator<Integer> sp2 = Arrays.spliterator(p);
					
					sp2.forEachRemaining((q)->
					{
						System.out.print(q.toString()+ " ");
					});
					System.out.println();
				});
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}
