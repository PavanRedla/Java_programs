package p2;
import p1.*;

public class DemoInnerClass3 {

	public static void main(String[] args) 
	{
		SubClass1 ob1 = new SubClass1(); // Outer Class Object
		ob1.m1(); // Outer Class Method call
		
		SubClass1.SubClass2 ob2 = ob1.new SubClass2(); // Instance Member InnerClass Object
		
		ob2.m2(); // Instance method InnerClass Instance Method call
		SubClass1.SubClass2.m22(); // Instance Method Inner Class Static Method Call
	}

}
