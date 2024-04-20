package p2;
import p1.*;

public class DemoInnerInterfaces1 
{
	public static void main(String[] args)
	{
		System.out.println("***InnerInterfaces in Class***");
		SubClass.ITest1 ob1 = (int a)->
		{
			System.out.println("--m1(a)--");
			System.out.println("The value a: "+a);
		};
		ob1.m1(11);
		
		SubClass.ITest11 ob11 = (int b)->
		{
			System.out.println("--m11(b)--");
			System.out.println("The value b: "+b);
		};
		ob11.m11(12);
		
		System.out.println("***InnerInterface in Interface***");
		ITest.ITest2 ob2 = (int c)->
		{
			System.out.println("--m2(c)--");
			System.out.println("The value c: "+c);
		};
		ob2.m2(13);
		
		System.out.println("***InnerInterfaces in AbstractClass***");
		AClass.ITest3 ob3 = (int d)->
		{
			System.out.println("--m3(d)--");
			System.out.println("The value d: "+d);
		};
		ob3.m3(14);
		
		AClass.ITest33 ob33 = (int e)->
		{
			System.out.println("--m33(e)--");
			System.out.println("The value e: "+e);
		};
		ob33.m33(15);		
	}

}
