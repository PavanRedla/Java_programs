package p2;
import p1.*;

public class DemoInterface1 
{
	public static void main(String args[])
	{
		// ITest ob = new ITest(); // we cannot create object for Interface directly.
		IClass ob = new IClass(); // Implementation class object
		
		ob.dis1();
		ob.dis2();
		ob.dis3();
		
	}
}
