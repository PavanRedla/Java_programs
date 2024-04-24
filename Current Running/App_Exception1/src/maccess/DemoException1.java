package maccess;
import java.util.Scanner;

public class DemoException1 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Marks of Java: ");
		int mk = Integer.parseInt(s.nextLine());
		System.out.println("Marks in Java: "+mk);
		s.close();
	}

}
