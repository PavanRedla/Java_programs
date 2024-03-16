// Demo on Constructors with different names for local varibales (a, b, c, d) and instance variables (name, city, mId, phNo).

import java.util.Scanner;

class Customer
{
	String name,city,mId;
	Long phNo;

	Customer(String a, String b, String c, Long d)
	{
		name = a;
		city = b;
		mId = c;
		phNo = d;
	}	
	void getCustomer()
	{
		System.out.println("*** Customer Details ***");
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Name: " + city);
		System.out.println("Customer Name: " + mId);
		System.out.println("Customer Name: " + phNo);
	}
}

class DemoCon2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Customer Name:");
		String cN = s.nextLine();
		System.out.println("Enter the Customer City:");
		String cC = s.nextLine();
		System.out.println("Enter the Customer Mail Id:");
		String cM = s.nextLine();
		System.out.println("Enter the Customer Phnumber:");
		Long pNo = s.nextLong();

		Customer ob = new Customer(cN,cC,cM,pNo);
		ob.getCustomer();
	}
}
