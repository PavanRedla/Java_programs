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
	}

}
