package p1;

public class CClass extends PClass {
	public static void m(int x) {
		
		//super.m(x); // super is a non primitive datatype variable(non static variable) 
					  // and it cannot be used or accessed under this static method of child class
		System.out.println("***CClass Static Method m(x)");
		System.out.println("The Value of x:"+x);
	}
}