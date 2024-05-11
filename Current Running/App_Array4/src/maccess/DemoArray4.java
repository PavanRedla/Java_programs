package maccess;

public class DemoArray4 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Object ob[] = new Object[4];
		ob[0] = new Integer(12);
		ob[1] = new Float(12.34F);
		ob[2] = new Character('A');
		ob[3] = new Boolean(true);
		
		System.out.println("---Display data from Object-Array---");
		for(Object k: ob)
		{
			System.out.println("Object: "+k.toString());
		}
	}

}
