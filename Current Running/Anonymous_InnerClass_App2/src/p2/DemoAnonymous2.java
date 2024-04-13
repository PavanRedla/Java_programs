package p2;
import p1.*;

public class DemoAnonymous2 
{
	public static void main(String[] args) 
	{
		Access ac = new Access();
		ITest ob = ac.getRef();
		ob.dis1(11);
		ob.dis2(12);
		//ob.dis3(13);
	}
}
