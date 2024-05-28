package p1;

public class User1 implements Runnable
{
	public Selection ob = null;
	public User1(Selection ob)
	{
		this.ob = ob;
	}
	@Override
	public void run()
	{
		ob.select(1, "Alex");
	}
}
