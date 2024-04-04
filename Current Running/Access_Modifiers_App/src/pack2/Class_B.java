package pack2;
import pack1.Class_A;

public class Class_B {

	public static void main(String[] args)
	{
		Class_A ob = new Class_A();
		System.out.println("Public Varible a value is : "+ob.a);
		//System.out.println("Protected Variable b Value is: "+ob.b);
		// we cannot access variable b here as it is private variable of class_A and it can be accessed only within the class(class_A)
		ob.dis(); // displaying protected variable via object when current class is not extending the class having protected member.
		Class_C cb = new Class_C();
		cb.protectedaccess();
	}

}
