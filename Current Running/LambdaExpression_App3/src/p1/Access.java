package p1;

public class Access 
{
	public static IArithmetic ob = null;
	public static IArithmetic getRef(int choice)
	{
		switch(choice)
		{
		case 1:
			ob = (float x, float y)->
			{
				return x+y;
			};
			break;
		case 2:
			ob = (float x, float y)->
			{
				return x-y;
			};
			break;
		case 3:
			ob = (float x, float y)->
			{
				return x*y;
			};
			break;
		case 4:
			ob = (float x, float y)->
			{
				return x/y;
			};
			break;
		case 5:
			ob = (float x, float y)->
			{
				return x%y;
			};
			break;
		case 6:
			System.out.println("Program Stopped!!!");
			System.exit(0);    // to terminate the program.
		}// end of switch
		return ob;
	}
	

}
