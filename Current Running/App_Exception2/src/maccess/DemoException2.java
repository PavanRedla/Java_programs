package maccess;
import java.util.*;

@SuppressWarnings("serial")
public class DemoException2 extends Exception
{
	public DemoException2(String msg)
	{
		super(msg);   	//Passing message to Parent Class (Exception) Constructor
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try
		{
			System.out.println("Enter Emp Basic Salary:");
			int bSal = Integer.parseInt(s.nextLine());
			System.out.println("BSal: "+bSal);
			
			if(bSal<12000)		// Exception-condition
			{
				DemoException2 ob = new DemoException2("Invalid BSal...");
				throw ob;
			}
			float totSal = bSal + (0.93F*bSal) + (0.61F*bSal);
			System.out.println("---Salary Details---");
			System.out.println("Basic Salary: "+bSal);
			System.out.println("Total Salary: "+totSal);
		}// end of try block
		
		
		catch(NumberFormatException nfe)
		{
			System.out.println("Enter Integer BSal only...");
			System.out.println("getMessage() - " + nfe.getMessage());
			System.out.println("toString() - "+ nfe.toString());
			System.out.println("object reference - "+ nfe);
			
			System.out.println("printStackTrace() - ");
			nfe.printStackTrace(); // it is void method 
		}
		
		catch(DemoException2 de)
		{
			System.out.println("getMessage() - " + de.getMessage());
			System.out.println("toString() - "+ de.toString());
			System.out.println("object reference - "+ de);
			
			System.out.println("printStackTrace() - ");
			de.printStackTrace(); // it is void method 
		}
		finally
		{
			s.close();
		}
	}
}
