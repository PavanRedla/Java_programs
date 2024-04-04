package pack1;
import pack1.Class_A;

public class Class_D extends Class_A
{
	public void access()
	{
		System.out.println("Protected variable c: "+c); 
		// Protected variable is available in all other classes of same package and in any other class
		//  of any other package as long as that class extends the class containing your protected member.
		
		System.out.println("Default variable d: "+d);
		// Default member is available in all other classes of same package.
	}

}