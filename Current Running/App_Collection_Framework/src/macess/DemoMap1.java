package macess;
import java.util.*;
import test.CustValues;

public class DemoMap1 
{
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
				}
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}
