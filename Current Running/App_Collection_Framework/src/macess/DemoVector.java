package macess;
import java.util.*;

public class DemoVector 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("default Capacity: "+v.capacity());
		System.out.println("size: "+v.size());
		
		v.addElement(new Integer(11));
		v.addElement(new Integer(13));
		v.addElement(new Integer(10));
		v.addElement(new Integer(18));
		
		
		System.out.println("Elements in V: "+v.toString());
		System.out.println("capacity: "+v.capacity());
		System.out.println("size: "+v.size());
		System.out.println("First Element: "+v.firstElement());
		System.out.println("Last Element: "+v.lastElement());
	}

}
