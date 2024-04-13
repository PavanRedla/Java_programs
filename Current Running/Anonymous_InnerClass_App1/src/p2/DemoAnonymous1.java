package p2;
import p1.*;

public class DemoAnonymous1 
{
	public static void main(String[] args) 
	{
		Access ac = new Access();
		
		PClass ob = ac.getRef();
		ob.m1(11);
		ob.m2(12);
		//ob.m3(14);
	}
}
