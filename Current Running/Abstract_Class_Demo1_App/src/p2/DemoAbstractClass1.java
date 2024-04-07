package p2;
import p1.*;

public class DemoAbstractClass1
{
	public static void main(String args[])
	{
		//Aclass ob = new Aclass(); // we cannot create object for abstract class.
		
		EClass ob = new EClass();
		ob.m1(11);
		ob.m2(12);
	}

}
