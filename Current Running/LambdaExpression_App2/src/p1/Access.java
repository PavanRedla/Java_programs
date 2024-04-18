package p1;

public class Access   // Outer Class
{
	public static IComparable ob = null;
	public static IComparable getRef(int choice)   // Outer Class Static Method
	{
		switch(choice)
		{
			case 1:
				ob = (int x, int y)->
					{
					if(x>y) return x;
					else return y;
					};
				break;	
			case 2:
				ob = (int x, int y)->
				{
					if(x<y) return x;
					else return y;
				};
				break;	
		} // end of switch
		return ob;
	}
}


