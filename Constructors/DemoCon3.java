// Demo on Constructors with same names for local varibales (name, city, mId, phNo) and instance variables (name, city, mId, phNo).

// if the local varibles and instance variables are having same names then the constructor gets confused and it will display output as null, inorder to avoid this situation, 

// we use this keyword. "this" keyword will hold the the reference(address) value of the Customer classs object (ob) and using which it will initialises the instance variables

import java.util.Scanner;

class Customer
{
	String name,city,mId;
	Long phNo;

	Customer(String name, String city, String mId, Long phNo)
	{
		this.name = name;
		this.city = city;
		this.mId = mId;
		this.phNo = phNo;
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

class DemoCon3
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
