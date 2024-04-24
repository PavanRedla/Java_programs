package p1;

public class Book // extends Object // As a default every class will extends from one parent class called Object automatically.
{
	public String bName, bAuthor;
	
	public Book(String bName, String bAuthor)
	{
		this.bName = bName;
		this.bAuthor = bAuthor;		
	}
	
	public String toString()
	{
		return bName+"\t"+bAuthor;
	}
}
