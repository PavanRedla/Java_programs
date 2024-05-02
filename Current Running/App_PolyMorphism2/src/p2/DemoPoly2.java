package p2;
import java.util.*;
import p1.TransLog;

public class DemoPoly2 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter hAccNo: ");
				long hAccNo = s.nextLong();
				System.out.println("Enter bAccNo: ");
				long bAccNo = s.nextLong();
				System.out.println("Enter the amount to transfer: ");
				float amt = s.nextFloat();
				
				TransLog ob = new TransLog(hAccNo, bAccNo, amt, new Date());
				// Immutable object
				
				System.out.println("--- Transaction Details---");
				System.out.println("hAccNo: "+ob.gethAccNo());
				System.out.println("bAccNo: "+ob.getbAccNo());
				System.out.println("Amount: "+ob.getAmt());
				System.out.println("DateTime: "+ob.getDateTime());
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
