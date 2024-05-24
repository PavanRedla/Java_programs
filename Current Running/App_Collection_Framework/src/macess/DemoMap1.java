package macess;
import java.util.*;
import test.CustValues;

public class DemoMap1 
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			
			{
				Map<Long,CustValues> m = null; // Map<K,V> K-> Primary key - Phno - Long Class, K-> Non-Primary Key - CustValues
				String nm = null;
				
				System.out.println("---Choice---");
				System.out.println("\t1.HashMap"
						+"\n\t2.LinkedHashMap"
						+"\n\t3.TreeMap"
						+"\n\t4.Hashtable"
						+"\n\t5.Exit"
						);
				System.out.println("Enter the choice: ");
				while(true)
				{
					switch(Integer.parseInt(s.nextLine()))
					{
					case 1:
						m = new HashMap<Long,CustValues>();
						nm = "HashMap";
						break;
					case 2:
						m = new LinkedHashMap<Long,CustValues>();
						nm = "LinkedHashMap";
						break;
					case 3:
						m = new TreeMap<Long,CustValues>();
						nm = "TreeMap";
						break;
					case 4:
						m = new Hashtable<Long,CustValues>();
						nm = "Hashtable";
						break;
					case 5:
						System.out.println("Operation stopped on Map...");
						System.exit(0);
					default: 
						System.out.println("Invalid choice...");
						continue;
					}
					System.out.println("---Perform Opertaions on "+nm+"---");
					xyz:while(true)
					{
						System.out.println("---Choice---");
						System.out.println("\t1.put(K,V)"
								+"\n\t2.remove(Object)"
								+"\n\t3.get(Object)"
								+"\n\t4.keySet()"
								+"\n\t5.values()"
								+"\n\t6.Exit"
								);
						System.out.println("Enter the choice: ");
						switch(Integer.parseInt(s.nextLine()))
						{
						case 1:
							System.out.println("Enter the Customer Details: ");
							System.out.println("Enter the Cust-Phno:");
							Long phNo = Long.parseLong(s.nextLine());
							System.out.println("Enter the Cust-Name:");
							String cName = s.nextLine();
							System.out.println("Enter the Cust-city:");
							String city = s.nextLine();
							System.out.println("Enter the Cust-MailId:");
							String mId = s.nextLine();
							m.put(new Long(phNo), new CustValues(cName,city,mId));
							
							System.out.println("---Customer Details---");
							m.forEach((p,q)->
							{
								System.out.println(p.toString()+"\t"+q.toString());								
							});
							break;
						case 2:
							if(m.isEmpty())
							{
								System.out.println("Map is empty...");
							}
							else
							{
								System.out.println("Enter the Phno. to remove the customer record");
								Long el = new Long(Long.parseLong(s.nextLine())); // remove() method parameter is Object
								if(m.containsKey(el))
								{
									m.remove(el);
									System.out.println("Customer details removed successfully ");
									System.out.println("---Customer Details---");
									m.forEach((p,q)->
									{
										System.out.println(p.toString()+"\t"+q.toString());								
									});
								}
								else
								{
									System.out.println("Invalid phno.");
								}
								
							}
							break;
						case 3:
							if(m.isEmpty())
							{
								System.out.println("Map is empty...");
							}
							else
							{
								System.out.println("Enter the Phno. to get the customer records");
								Long el2 = new Long(Long.parseLong(s.nextLine())); // remove() method parameter is Object
								if(m.containsKey(el2))
								{
									CustValues cv = m.get(el2); // get return type is Values (CustValues)
									System.out.println(cv.toString());
								}
								else
								{
									System.out.println("Invalid phno.");
								}
								
							}
							break;
						case 4:
							if(m.isEmpty())
							{
								System.out.println("Map is empty...");
							}
							else
							{
								Set<Long> ks = m.keySet(); // return type of keySet is Set<E>
								System.out.println("---keySet()---");
								ks.forEach((x)->
								{
									System.out.println(x.toString());
								});
								
							}
							break;
						case 5:
							if(m.isEmpty())
							{
								System.out.println("Map is empty...");
							}
							else
							{
								Collection<CustValues> c = m.values(); // return type of values is Collection<E>
								System.out.println("---values()---");
								c.forEach((y)->
								{
									System.out.println(y.toString());
								});
								
							}
							break;
						case 6:
							System.out.println("Operations Stopped...");
							break xyz; // stop the Inner loop
						default: 
							System.out.println("Invalid choice...");
							
						}
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
