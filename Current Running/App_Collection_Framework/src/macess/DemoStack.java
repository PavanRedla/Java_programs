package macess;
import java.util.*;
public class DemoStack 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Stack<Integer> ob = new Stack<Integer>();
				while(true)
				{
					System.out.println("---Choice---");
					System.out.println("\t1.push(E)"
							+"\n\t2.pop()"
							+"\n\t3.peek()"
							+"\n\t4.search(object)"
							+"\n\t5.Exit"
							);
					System.out.println("Enter the Choice: ");
					switch(s.nextInt())
					{
					case 1:
						System.out.println("Enter the element: ");
						ob.push(new Integer(s.nextInt()));
						System.out.println(ob.toString());
						break;
					case 2:
						if(ob.empty())
						{
							System.out.println("Stack is empty...");
						}
						else
						{
							ob.pop();
							System.out.println(ob.toString());
						}
						break;
					case 3:
						if(ob.empty())
						{
							System.out.println("Stack is empty...");
						}
						else
						{
							System.out.println("Peek ele: "+ob.peek());
							System.out.println(ob.toString());
						}
						break;
					case 4:
						if(ob.empty())
						{
							System.out.println("Stack is empty...");
						}
						else
						{
							System.out.println("Enter the element to be searched");
							Integer el = new Integer(s.nextInt());
							int pos = ob.search(el);
							if(pos>0)
							{
								System.out.println("Element found at position: "+pos);
								System.out.println(ob.toString());
							}
							else
							{
								System.out.println("Element not found in Stack...");
								System.out.println(ob.toString());
							}
						}
						break;
					case 5:
						System.out.println("Operation stopped on Stack...");
						System.exit(0);
						break;
					default: 
						System.out.println("Invalid Choice...");
					
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
