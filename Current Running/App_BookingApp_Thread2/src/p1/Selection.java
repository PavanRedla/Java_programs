package p1;

public class Selection
{
	public void select(int n, String name)
	{
		if(n<=Available.avl)
		{
			System.out.println(n+"ticket booked for "+name);
			Available.avl = Available.avl-n;
		}
		else
		{
			System.out.println("Sorry! no tickets available for "+name);
		}
	}
}
