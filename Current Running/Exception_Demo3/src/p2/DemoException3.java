package p2;

public class DemoException3 
{
	@SuppressWarnings({ "rawtypes",  "deprecation" })
	public static void main(String[] args) 
	{
		try
		{
			//Display d = new Display();
		Class c = Class.forName("p1.Display");
		p1.Display d = (p1.Display)c.newInstance();
		d.dis(123);	
		}
		catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe.toString());
		}
		catch(InstantiationException ie)
		{
			System.out.println(ie.toString());
		}
		catch(IllegalAccessException iae)
		{
			System.out.println(iae.toString());
		}
	}
}
