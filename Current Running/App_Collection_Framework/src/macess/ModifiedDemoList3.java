package macess;
import java.util.*;
import test.ProductDetails;
import java.util.function.*;

public class ModifiedDemoList3 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				ArrayList<ProductDetails> al = new ArrayList<ProductDetails>();
				System.out.println("Enter the no. of products: ");
				int n = Integer.parseInt(s.nextLine());
				System.out.println("Enter "+n+" strings...");
				for(int i =1;i<=n;i++)
				{
					System.out.println("---ProductDetails-"+i+"---");
					System.out.println("Enter the Product Name: ");
					String nm = s.nextLine();
					System.out.println("Enter the Product Price: ");
					float price = Float.parseFloat(s.nextLine());
					al.add(new ProductDetails(nm,price));
				}
				
				System.out.println("---ProductDetails---");
				Spliterator<ProductDetails> sp1 = al.spliterator();
				sp1.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
				
				// Function
				Function<ProductDetails, ProductDetails> fr = (x)->
				{
					x.price = x.price + (0.35f*x.price);
					return x;
				};
				
				System.out.println("---ProductDetails (Price incremented by 35%)---");
				Spliterator<ProductDetails> sp2 = al.spliterator();
				sp2.forEachRemaining((k)->
				{
					System.out.println(fr.apply(k));
				});
				
				System.out.println("---replaceAll()---");
				al.replaceAll( (x)->
				{
					x.price = x.price + (0.45f*x.price);
					return x;
				});
				Spliterator<ProductDetails> sp3 = al.spliterator();
				sp3.forEachRemaining((k)->
				{
					System.out.println(k.toString());
				});
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}

	}

}
