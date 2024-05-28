package p1;

public class User2 implements Runnable
{
	@Override
	public void run()
	{
		Selection.select(1, "Ram");
	}
}
