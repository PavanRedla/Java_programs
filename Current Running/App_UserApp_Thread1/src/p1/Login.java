package p1;
import java.util.*;
public class Login implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ram...Reg...Process..."+ new Date())	;
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
	}
}
