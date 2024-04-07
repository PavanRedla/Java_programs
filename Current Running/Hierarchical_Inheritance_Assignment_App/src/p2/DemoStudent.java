package p2;
import java.util.Scanner;

import p1.*;

public class DemoStudent 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("***Choice***");
		System.out.println("t1.DayScholar\nt2.Hosteler");
		System.out.println("Enter your Choice: ");
		int choice = Integer.parseInt(s.nextLine());
		
		switch(choice)
		{
		case 1:
			DayScholar ob1 = new DayScholar();
			System.out.println("Enter the studentId: ");
			ob1.studentId = Integer.parseInt(s.nextLine());
			System.out.println("Enter the Student Name: ");
			ob1.name = s.nextLine();
			
			System.out.println("Enter the total amount(17000+23000+45000)");
			int amt = Integer.parseInt(s.nextLine());
			
			System.out.println(ob1.displayDetails());
			
			System.out.println("retrun amt: "+ob1.payFee(amt));
			break;
		case 2:
			Hosteller ob2 = new Hosteller();
			System.out.println("Enter the studentId: ");
			ob2.studentId = Integer.parseInt(s.nextLine());
			System.out.println("Enter the Student Name: ");
			ob2.name = s.nextLine();
			
			System.out.println("Enter the total amount(17000+23000+45000)");
			int amt2 = Integer.parseInt(s.nextLine());
			
			System.out.println(ob2.displayDetails());
			
			System.out.println("retrun amt: "+ob2.payFee(amt2));
			break;
		}
	}

}
