package p1;

public class BookDetails {
	public String bCode,bName,bAuthor;
	public float bPrice;
	public int bQty;
	
	public void getBookDetails()
	{
		System.out.println("***BookDetails***");
		System.out.println("Book Code is :"+bCode);
		System.out.println("Book Name is :"+bName);
		System.out.println("Book Author is :"+bAuthor);
		System.out.println("Book Price is :"+bPrice);
		System.out.println("Book Quantity is :"+bQty);
	}

}
