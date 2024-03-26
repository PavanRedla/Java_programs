package p2;
import java.util.Scanner;
import p1.*;

public class DemoRef1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		BankCustomer bc = new BankCustomer();
		
		System.out.println("Enter the Accno:");
		bc.accNo = Long.parseLong(s.nextLine());
		System.out.println("Enter the Customer Name:");
		bc.name = s.nextLine();
		System.out.println("Enter the Mail ID:");
		bc.ct.mId = s.nextLine();
		System.out.println("Enter the Phone Number:");
		bc.ct.phNo = Long.parseLong(s.nextLine());
		System.out.println("Enter the Account Type:");
		bc.ac.accType = s.nextLine();
		System.out.println("Enter the Account Balance:");
		bc.ac.bal = s.nextFloat();
		
		bc.getBankCustomer();
		bc.ct.getContact();
		bc.ac.getAccount();		
		
		s.close();
	}

}
