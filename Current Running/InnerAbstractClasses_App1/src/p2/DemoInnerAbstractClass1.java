package p2;
import p1.*;

public class DemoInnerAbstractClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("***InnerAbstractClasses in Class");
		
		SubClass sc = new SubClass(); // OuterClass object
		
		SubClass.AClass1 ob1 = sc.new AClass1()  
		{	
			public void m1(int a)
			{
				System.out.println("--m1(a)--");
				System.out.println("The value a: "+a);
			}
	    };
	    ob1.m1(11);
	    
	    SubClass.AClass11 ob11 = new SubClass.AClass11()
	    {
	    	public void m11(int b)
			{
				System.out.println("--m11(b)--");
				System.out.println("The value b: "+b);
			}
	    };
	    ob11.m11(12);
	    
	    System.out.println("***InnerAbstractClasses in Interface");
	    
	    ITest.AClass2 ob2 = new ITest.AClass2() 
	    {
			public void m2(int c) 
			{
				System.out.println("--m2(c)--");
				System.out.println("The value c: "+c);
			}
		};
		ob2.m2(13);
	    
	    System.out.println("***InnerAbstractClasses in AbstractClass");
	    
	    AClass ob = new AClass();       // object for OuterAbstractClass
	    {
	    	// Anonymous InnerClass without members
	    	// As we cannot create object for Abstract class directly,
	    	// This Anonymous Innerclass is created to create object for Abstract
	    	
	    	// why to create object for OuterAbstract class?
	    	// Inorder to create object for InnerAbstractClasses present in OuterAbstractClass(AClass),
	    	// we need to create object for outerAbstract Class first.
	    };
	    
	    AClass.AClass3 ob3 = ob.new AClass3()
	    {
	    	public void m3(int d)
	    	{
	    		System.out.println("--m3(d)--");
				System.out.println("The value d: "+d);
	    	}
	    };	
	    ob3.m3(14);
	    
	    AClass.AClass33 ob33 = new AClass.AClass33() 
	    {
			public void m33(int e) 
			{
				System.out.println("--m33(e)--");
				System.out.println("The value e: "+e);
			}
		};
		ob33.m33(15);
	}
}
