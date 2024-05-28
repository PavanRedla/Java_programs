package p2;
import p1.*;

public class DemoThread2 
{
	public static void main(String[] args)
	{
		Selection ob = new Selection();
		
		User1 u1 = new User1(ob);
		User2 u2 = new User2(ob);
		
		Thread t1 = new Thread(u1);
		Thread t2 = new Thread(u2);
		
		t1.start();
		t2.start();
	}

}
