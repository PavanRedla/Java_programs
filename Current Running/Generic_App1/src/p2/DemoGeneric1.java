package p2;
import p1.*;

public class DemoGeneric1 
{
	public static void main(String args[])
	{
		System.out.println("--- Object holding User data ---");
		
		Display<User> ob1 = new Display<User>();
		
		ob1.setOb(new User("Alex", "a@gmail.com"));
		
		User u = ob1.getOb();
		
		System.out.println(u.toString());
		
		System.out.println("--- Object holding Book data ---");
		
		Display<Book> ob2 = new Display<Book>();
		
		ob2.setOb(new Book("CJ", "YXZ"));
		
		Book b = ob2.getOb();
		
		System.out.println(b.toString());
		
	}

}
