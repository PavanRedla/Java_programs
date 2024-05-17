package macess;
import java.util.*;

public class DemoList1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<Integer> al = new ArrayList<Integer>();
				while(true)
				{
					System.out.println("---Choice---");
					System.out.println("\t1.add(E)"
							+"\n\t2.add(index, E)"
							+"\n\t3.remove(Object)"
							+"\n\t4.remove(index)"
							+"\n\t5.get(index)"
							+"\n\t6.set(index, E)"
							+"\n\t7.Display"
							+"\n\t8.Exit");
					System.out.println("Enter the Choice: ");
					switch(s.nextInt())
					{
					case 1: 
						System.out.println("Enter the Element: ");
						al.add(s.nextInt());
						System.out.println(al.toString());
						System.out.println("Size: "+al.size());
						break;
					case 2: 
						if(al.isEmpty())
						{
							System.out.println("List is empty..");
						}
						else
						{
							System.out.println("Enter the index to add element: ");
							int i1 = s.nextInt();
							if(i1>=0 && i1<al.size())
							{
								System.out.println("Enter the element to add by index: ");
								al.add(i1, new Integer(s.nextInt()));
								System.out.println(al.toString());
								System.out.println("Size: "+al.size());
							}
							else
							{
								System.out.println("Invalid Index value: ");
							}
						}
						break;
					case 3: 
						if(al.isEmpty())
						{
							System.out.println("List is Empty..");
						}
						else
						{
							System.out.println("Enter the element to be removed: ");
							Integer el = new Integer(s.nextInt());
							if(al.remove(el))
							{
								System.out.println("Element remvoed successfully..");
								System.out.println(al.toString());
								System.out.println("Size: "+al.size());
							}
							else
							{
								System.out.println("Element not found in the list..");
							}
						}
						break;
					case 4: 
						if(al.isEmpty())
						{
							System.out.println("List is Empty..");
						}
						else
						{
							System.out.println("Enter the index to remove element: ");
							int i2 = s.nextInt();
							if(i2>=0 && i2<al.size())
							{
								al.remove(i2);
								System.out.println("Element remvoed successfully..");
								System.out.println(al.toString());
								System.out.println("Size: "+al.size());
							}
							else
							{
								System.out.println("Invalid Index value...");
							}
						}
						break;
					case 5: 
						if(al.isEmpty())
						{
							System.out.println("List is Empty...");
							
						}
						else
						{
							System.out.println("Enter the index to get the Element: ");
							int i3 = s.nextInt();
							if(i3>=0 && i3<al.size())
							{
								Integer ob = al.get(i3);
								System.out.println("Element at index "+i3+" is "+ob.toString());
								System.out.println(al.toString());
								System.out.println("Size: "+al.size());
							}
							else
							{
								System.out.println("Invalid Index Value...");
							}
						}
						break;
					case 6: 
						if(al.isEmpty())
						{
							System.out.println("List is Empty...");
							
						}
						else
						{
							System.out.println("Enter the index to set the Element: ");
							int i4 = s.nextInt();
							if(i4>=0 && i4<al.size())
							{
								System.out.println("Enter the element to set by index: ");
								Integer el2 = new Integer(s.nextInt());
								al.set(i4, el2);
								System.out.println("Element repalced successfully");
								System.out.println(al.toString());
								System.out.println("Size: "+al.size());
							}
							else
							{
								System.out.print("Invalid Index value...");
							}
						}
						break;
					case 7: 
						System.out.println("---Iterator<E>---");
						Iterator<Integer> it = al.iterator();
						while(it.hasNext())
						{
							Integer el = (Integer)it.next();
							System.out.print(el.toString());
						}
						
						System.out.println("---ListIterator<E>---");
						ListIterator<Integer> li = al.listIterator();
						System.out.print("Forward: ");
						while(li.hasNext())
						{
							Integer el = (Integer)li.next();
							System.out.print(el.toString());
						}
						System.out.print("\nBackward: ");
						while(li.hasPrevious())
						{
							Integer el = (Integer)li.previous();
							System.out.print(el.toString());
						}
						
						System.out.println("---Spliterator<E>---");
						Spliterator<Integer> sp = al.spliterator();
						sp.forEachRemaining((k)->
						{
							System.out.print(k.toString());
						});
						break;
					case 8: 
						System.out.println("Operation stopped on List...");
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
