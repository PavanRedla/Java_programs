package macess;
import java.util.*;

public class DemoSet2 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		TreeSet<Integer> ts3 = new TreeSet<Integer>();
		TreeSet<Integer> ts4 = new TreeSet<Integer>();
		TreeSet<Integer> ts6 = new TreeSet<Integer>();
		
		ts1.add(new Integer(12));
		ts1.add(new Integer(11));
		ts1.add(new Integer(14));
		ts1.add(new Integer(16));
		
		ts2.add(new Integer(22));
		ts2.add(new Integer(21));
		ts2.add(new Integer(24));
		ts2.add(new Integer(26));
		
		ts3.add(new Integer(32));
		ts3.add(new Integer(31));
		ts3.add(new Integer(34));
		ts3.add(new Integer(16));
		
		ts4.add(new Integer(12));
		ts4.add(new Integer(21));
		ts4.add(new Integer(34));
		ts4.add(new Integer(16));
		
		ts6.add(new Integer(22));
		ts6.add(new Integer(21));
		ts6.add(new Integer(24));
		ts6.add(new Integer(26));
		
		System.out.println("ts1: "+ts1.toString());
		System.out.println("ts2: "+ts2.toString());
		System.out.println("ts3: "+ts3.toString());
		System.out.println("ts4: "+ts4.toString());
		
		System.out.println("---addAll()---");
		ts1.addAll(ts2);
		System.out.println("ts1: "+ts1.toString());
		System.out.println("ts2: "+ts2.toString());
		System.out.println("ts3: "+ts3.toString());
		System.out.println("ts4: "+ts4.toString());
		
		System.out.println("---retainAll()---");
		ts1.retainAll(ts4);
		System.out.println("ts1: "+ts1.toString());
		System.out.println("ts2: "+ts2.toString());
		System.out.println("ts3: "+ts3.toString());
		System.out.println("ts4: "+ts4.toString());
		
		System.out.println("---contains(Object)---");
		boolean p = ts1.contains(new Integer(12));
		System.out.println("12 available in ts1: "+p);
		
		System.out.println("---containsAll(Collection<E>)---");
		boolean q = ts1.containsAll(ts2);
		System.out.println("ts2 available in ts1: "+q);
		
		System.out.println("---containsAll(Collection<E>)---");
		boolean r = ts2.containsAll(ts6);
		System.out.println("ts6 available in ts1: "+r);
		
		System.out.println("---of()---"); // used to create Immutable objects
		Set<Integer> ts5 = Set.of(100,200,300,400);
		System.out.println("data in ts5: "+ts5.toString());
		
		// ts5.add(new Integer(700)); // Exception when we try to change the Immutable objects
		// System.out.println("data in ts5: "+ts5.toString());
		
		System.out.println("---clear()---");
		ts3.clear();
		System.out.println("data in ts3: "+ts3.toString());
		
		System.out.println("---toArray()---"); // return type is Object array (Parent Class)
		Object o[] = ts2.toArray();
		for(Object k: o)
		{
			System.out.print(k.toString());
		}
		
		System.out.println("---toArray()---"); // return type is ClassName (extended from parent Class)
		Integer ob[] = new Integer[ts2.size()];
		ob = ts2.toArray(ob);
		for(Object k: ob)
		{
			System.out.print(k.toString());
		}
		
		
	}

}
