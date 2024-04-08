package p2;
import p1.*;

public class DemoInnerClass1 {
	public static void main(String[] args) 
	{
		SubClass1 ob1 = new SubClass1();  // OuterClass_Object
		ob1.m1();   // Outer_Class Instance method call
		
		SubClass1.SubClass2 ob2 = new SubClass1.SubClass2();  // Static Member InnerClass Object
		
		ob2.m2();    // InnerClass Instance Method Call
		SubClass1.SubClass2.m22();  // Inner Class static method call
		
	}

}
