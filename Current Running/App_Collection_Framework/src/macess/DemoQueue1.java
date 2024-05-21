package macess;
import java.util.*;
public class DemoQueue1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(new Integer(12));
		pq.add(new Integer(13));
		pq.add(new Integer(14));
		pq.add(new Integer(15));
		System.out.println("data in pq: "+pq.toString());
		System.out.println("---offer(E)---");
		pq.offer(new Integer(100));
		System.out.println("data in pq: "+pq.toString());
		System.out.println("---peek()---");
		System.out.println("Peek ele: "+pq.peek());
		System.out.println("data in pq: "+pq.toString());
		System.out.println("---element()---");
		System.out.println("element: "+pq.element());
		System.out.println("data in pq: "+pq.toString());
		System.out.println("---remove()---");
		System.out.println("Removed ele: "+pq.remove());
		System.out.println("data in pq: "+pq.toString());
		System.out.println("---poll()---");
		System.out.println("Removed ele: "+pq.poll());
		System.out.println("data in pq: "+pq.toString());
	}

}
