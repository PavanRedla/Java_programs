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
		
		ad.addFirst(new Integer(100));
		ad.addLast(new Integer(200));
		System.out.println("data in ad: "+ad.toString());
		
		ad.removeFirstOccurrence(new Integer(12));
		ad.removeLastOccurrence(new Integer(15));
		System.out.println("data in ad: "+ad.toString());
		
		System.out.println("---iterator()---");
		Iterator<Integer> it1 = ad.iterator();
		it1.forEachRemaining((p)->
		{
			System.out.print(p.toString()+ " ");
		});
		
		System.out.println("\n---descendingIterator()---");
		Iterator<Integer> it2 = ad.descendingIterator();
		it2.forEachRemaining((q)->
		{
			System.out.print(q.toString()+ " ");
		});
		
	}

}
