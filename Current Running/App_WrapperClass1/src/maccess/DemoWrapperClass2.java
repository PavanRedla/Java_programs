package maccess;

public class DemoWrapperClass2 
{
	public static void main(String[] args) 
	{
		// AUTOBOXING PROCESS
		Integer ob1 = 12;
		Float ob2 = 23.45F;
		Character ob3 = 'A';
		Boolean ob4 = true;
		// AUTOUNBOXING PROCESS
		int i = ob1;
		float f = ob2;
		char ch = ob3;
		boolean b = ob4;
		System.out.println("---data values---");
		System.out.println("int-value: "+i);
		System.out.println("float-value: "+f);
		System.out.println("char-value: "+ch);
		System.out.println("boolean-value: "+b);
	}

}
