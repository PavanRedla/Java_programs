package pack2;
import pack1.Class_A;

public class Class_C extends Class_A
{
	public void protectedaccess()
	{
		System.out.println("Protected variable c: "+c);
		// Protected variable is available in all other classes of same package and in any other class
		//  of any other package as long as that class extends the class containing your protected member.
				
	}
	 
}
