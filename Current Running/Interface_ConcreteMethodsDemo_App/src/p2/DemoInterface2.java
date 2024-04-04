package p2;

import p1.IClass;
import p1.ITest;

public class DemoInterface2 {

	public static void main(String[] args) 
	{
		IClass ob = new IClass();
		ob.m1(12); // Abstract_method_call
		
		ITest.m2(13); // static concrete method_call
		
		ob.m3(14,15,16);    // default concrete method call
	}

}
