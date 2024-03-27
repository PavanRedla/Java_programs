package p1;
import java.util.Scanner;

public class ReadBookDetails {
	public Scanner s;
	public BookDetails bd;
	
	public ReadBookDetails(Scanner s, BookDetails bd)
	{
		this.s = s;
		this.bd = bd;
	}
	
	public void read()
	{
		System.out.println("Enter the Bood Code: ");
		bd.bCode = s.nextLine();
		System.out.println("Enter the Bood Name: ");
		bd.bName = s.nextLine();
		System.out.println("Enter the Bood Author: ");
		bd.bAuthor = s.nextLine();
		System.out.println("Enter the Bood Price: ");
		bd.bPrice = s.nextFloat();
		System.out.println("Enter the Bood Quantity: ");
		bd.bQty = s.nextInt();
	}

}
