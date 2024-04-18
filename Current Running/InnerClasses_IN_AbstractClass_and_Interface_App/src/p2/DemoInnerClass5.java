package p2;
import p1.*;

public class DemoInnerClass5 
{
	public static void main(String[] args) 
	{
		System.out.println("***InnerClass in Interface***");
		
		ITest.SubClass1 ob1 = new ITest.SubClass1(); // object for static member InnerClass(SubClass1) available in Interface(ITest)
		ob1.m1(11);
		
		System.out.println("***InnerClasses in AbstractClass***");
		
		AClass ob = new AClass()
		{
			// Anonymous InnerClass without members
		};
		
		AClass.SubClass2 ob2 = ob.new SubClass2();  // object for Instance Member InnerClass(SubClass2) available in AbstractClass(AClass)
		
		ob2.m2(12);
		
		AClass.SubClass3 ob3 = new AClass.SubClass3(); // object for Static Member(SubClass3) InnerClass available in AbstractClass(AClass)
		
		ob3.m3(13);

	}

}
