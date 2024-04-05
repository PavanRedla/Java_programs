package p2;
import p1.*;

public class DemoInterface5 
{
	public static void main(String args[])
	{
		IClass ob = new IClass();
		ob.m1(12);
		ITest1.m2(13);
		ITest2.m2(14);
		ob.m3(15);
		ob.m33(16);
	}

}
