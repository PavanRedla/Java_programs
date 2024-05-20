package test;

public class BookDetails 
{
	public String bCode;
	public String bName;
	public String author;
	public float price;
	public int qty;
	
	public BookDetails(String bCode, String bName, String author, float price, int qty)
	{
		this.bCode = bCode;
		this.bName = bName;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String toString()
	{
		return "Book Code: "+bCode+"\tBook Name: "+bName+"\tBook Author: "+author+
				"\tBook Price: "+price+ "\tBook Quantity: "+qty;
	}
}
