package macess;
import java.util.*;
import test.BookDetails;

public class DemoListBook 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<BookDetails> al = new ArrayList<BookDetails>();
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
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						System.out.println("Enter Book Details");
						System.out.println("Enter the Book Code: ");
						String bCode = s.nextLine();
						System.out.println("Enter the Book Name: ");
						String bName = s.nextLine();
						System.out.println("Enter the Book Author: ");
						String author = s.nextLine();
						System.out.println("Enter the Book Price: ");
						float price = Float.parseFloat(s.nextLine());
						System.out.println("Enter the Book Quantity: ");
						int qty = Integer.parseInt(s.nextLine());
						
						al.add(new BookDetails(bCode, bName, author, price, qty));
						System.out.println(al.toString());
						System.out.println(al.size());
						break;
//						Spliterator<BookDetails> sp1 = al.spliterator();
//						sp1.forEachRemaining((k)->
//						{
//							System.out.println(k.toString());
//						});
						
					case 2:
						if(al.isEmpty())
						{
							System.out.println("List is Empty...");
						}
						else
						{
							System.out.println("Enter the index to add the Book Details: ");
							int i1 = Integer.parseInt(s.nextLine());
							if(i1>=0 && i1<al.size())
							{
								System.out.println("Enter Book Details");
								System.out.println("Enter the Book Code: ");
								String bCode1 = s.nextLine();
								System.out.println("Enter the Book Name: ");
								String bName1 = s.nextLine();
								System.out.println("Enter the Book Author: ");
								String author1 = s.nextLine();
								System.out.println("Enter the Book Price: ");
								float price1 = Float.parseFloat(s.nextLine());
								System.out.println("Enter the Book Quantity: ");
								int qty1 = Integer.parseInt(s.nextLine());
								
								al.add(i1,new BookDetails(bCode1, bName1, author1, price1, qty1));
								System.out.println(al.toString());
								System.out.println(al.size());
							}
							else
							{
								System.out.println("Invalid Index value: ");
							}
						}
						break;
					case 3:
						
						break;
					case 4:
						if(al.isEmpty())
						{
							System.out.println("List is Empty..");
						}
						else
						{
							System.out.println("Enter the index to remove element: ");
							int i2 = Integer.parseInt(s.nextLine());
							if(i2>=0 && i2<al.size())
							{
								al.remove(i2);
								System.out.println("Book element remvoed successfully..");
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
							int i3 = Integer.parseInt(s.nextLine());
							if(i3>=0 && i3<al.size())
							{
								BookDetails ob = al.get(i3);
								System.out.println("Element at index "+i3+" is "+ob.toString());
								System.out.println();
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
							int i4 = Integer.parseInt(s.nextLine());
							if(i4>=0 && i4<al.size())
							{
								System.out.println("Enter Book Details");
								System.out.println("Enter the Book Code: ");
								String bCode1 = s.nextLine();
								System.out.println("Enter the Book Name: ");
								String bName1 = s.nextLine();
								System.out.println("Enter the Book Author: ");
								String author1 = s.nextLine();
								System.out.println("Enter the Book Price: ");
								float price1 = Float.parseFloat(s.nextLine());
								System.out.println("Enter the Book Quantity: ");
								int qty1 = Integer.parseInt(s.nextLine());
								
								al.set(i4,new BookDetails(bCode1, bName1, author1, price1, qty1));
								
								System.out.println("Element repalced successfully");
								System.out.println();
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
						Iterator<BookDetails> it = al.iterator();
						while(it.hasNext())
						{
							BookDetails el = (BookDetails)it.next();
							System.out.print(el.toString()+"\n");
						}
						
						System.out.println("---ListIterator<E>---");
						ListIterator<BookDetails> li = al.listIterator();
						System.out.print("Forward: ");
						while(li.hasNext())
						{
							BookDetails el = (BookDetails)it.next();
							System.out.print(el.toString()+"\n");
						}
						System.out.print("\nBackward: ");
						while(li.hasPrevious())
						{
							BookDetails el = (BookDetails)it.next();
							System.out.print(el.toString()+"\n");
						}
						
						System.out.println("---Spliterator<E>---");
						Spliterator<BookDetails> sp = al.spliterator();
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
