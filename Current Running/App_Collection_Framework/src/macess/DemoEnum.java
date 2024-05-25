package macess;
import test.Books;
import java.util.*;

public class DemoEnum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				Books bk[] =  Books.values();
				System.out.println("---Display Enum data---");
				for(Books z: bk)
				{
					System.out.println("BookName: "+z.toString() +"\tPrice: "+z.price);
				}
				
				System.out.println("---Load data using Setter Method---");
				for(Books z: bk)
				{
					System.out.println("Enter the price of : "+z.toString());
					z.setPrice(s.nextFloat());
				}
				
				System.out.println("---Display Enum data using Getter methods---");
				for(Books z: bk)
				{
					System.out.println("BookName: "+z.toString() +"\tPrice: "+z.getPrice());
				}
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}
