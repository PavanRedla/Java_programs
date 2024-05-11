package maccess;

public class DemoWrapperClass1
{
	@SuppressWarnings("removal")
	public static void main(String args[])
	{
		// BOXING PROCESS
		Integer ob1 = new Integer(12);
		Integer ob2 = new Integer("13");
		Float ob3 = new Float(23.45F);
		Float ob4 = new Float(45.67);
		Float ob5 = new Float("12.11F");
		Character ob6 = new Character('A');
		Boolean ob7 = new Boolean(true);
		Boolean ob8 = new Boolean("false");
		
		// UNBOXING PROCESS
		int i1 = ob1.intValue();
		int i2 = ob2.intValue();
		float f1 = ob3.floatValue();
		double d= ob4.doubleValue();
		float f2 = ob5.floatValue();
		char ch = ob6.charValue();
		boolean b1 = ob7.booleanValue();
		boolean b2 = ob8.booleanValue();
		
		System.out.println("---Display data ---");
		System.out.println("int-value: "+i1);
		System.out.println("int-value: "+i2);
		System.out.println("flaot-value: "+f1);
		System.out.println("double-value: "+d);
		System.out.println("float-value: "+f2);
		System.out.println("char-value: "+ch);
		System.out.println("boolean-value: "+b1);
		System.out.println("boolean-value: "+b2);
		
	}

}
