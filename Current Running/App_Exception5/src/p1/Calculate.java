package p1;

@SuppressWarnings("serial")
public class Calculate extends Exception
{
	public Calculate(String msg)
	{
		super(msg);
	}
	
	public void cal(int x, int y) throws Calculate
	{
		try
		{
			if(x==0 || y==0)
			{
				Calculate ob1 = new Calculate("Values are equal to zero");
				throw ob1;
			}
			if(x<0 || y<0)
			{
				Calculate ob2 = new Calculate("Values are Negative");
				throw ob2;
			}
			float res = (float)(x+y)/2;
			System.out.println("Average of "+x+" and "+y+ " is: " +res);
		}
		catch(Calculate ob)
		{
			throw ob;
		}
	}
}
