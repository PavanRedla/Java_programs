package p2;
import p1.ProductDetails;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class DemoArray1 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of Products");
		int n = Integer.parseInt(s.nextLine());
		
		ProductDetails pd[] = new ProductDetails[n];
		System.out.println("Enter"+n+"Product Details");
		
		for(int i=0; i<pd.length; i++)
		{
			System.out.println("***Product Details "+(i+1)+"***");
			System.out.println("Enter the ProdCode: ");
			String pC = s.nextLine();
			System.out.println("Enter the ProdName: ");
			String pN = s.nextLine();
			System.out.println("Enter the ProdPrice: ");
			float pP = Float.parseFloat(s.nextLine());
			System.out.println("Enter the ProdQty: ");
			int pQ = Integer.parseInt(s.nextLine());
			
			pd[i] = new ProductDetails(pC,pN,pP,pQ);
		} // end of for loop
		System.out.println("---Using Old for loop---");
		for(int i=0;i<pd.length;i++)
		{
			System.out.println(pd[i].toString());
		}
		
		System.out.println("---Using Extended for loop (Java5)---");
		for(ProductDetails k: pd)
		{
			System.out.println(k.toString());
		}
		
		System.out.println("---Uisng Spliterator<T> (Java8)---");
		Spliterator<ProductDetails> sp = Arrays.spliterator(pd);
		sp.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});
		
		s.close();
	}
}
