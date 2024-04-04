package p2;
import java.util.Scanner;
import p1.*;

public class DemoInterface4 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number-1:");
		int v1 = s.nextInt();
		System.out.println("Enter number-2:");
		int v2 = s.nextInt();
		
		System.out.println("Enter your choice:\n 1.Greater Value/n 2.Smaller Value");
		int choice = s.nextInt();
		
		switch(choice)
		{
		case 1: 
		{
			GreaterValue gv = new GreaterValue();
			int greatest = gv.compareTo(v1,v2);
			System.out.println("Greatest value between " +v1+ " and " +v2 + " is: "+greatest);
			break;
		}
		case 2:
		{
			SmallerValue sv = new SmallerValue();
			int smallest = sv.compareTo(v1,v2);
			System.out.println("Smallest value between " +v1+ " and " +v2 + " is: "+smallest);
			break;
		}
		default: System.out.println("Invalid Choice");
		
		s.close();
			
		}
	}

}
