package p1;

public class IClass implements ITest
{
	public void dis1() // Implemented method and overriding method
	{
		System.out.println("***dis1()***");
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rNo);
		
	}
	public void dis2() // Implemented method and overriding method
	{
		System.out.println("***dis2()***");
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rNo);
		
	}
	public void dis3() // Not-Implemented method
	{
		System.out.println("***dis3()***");
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rNo);
		// not-implemented method also can access the interface varibles due to extend keyword.
	}
}
