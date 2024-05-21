package macess;
import java.util.*;
public class DemoQueue2 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		ad.add(new Integer(12));
		ad.add(new Integer(13));
		ad.add(new Integer(14));
		ad.add(new Integer(15));
		ad.add(new Integer(12));
		ad.add(new Integer(13));
		ad.add(new Integer(14));
		ad.add(new Integer(15));
		System.out.println("data in ad: "+ad.toString());
		
		

	}

}
