 // Loading data to objects using OBJECT REFERENCE VARIBALE

import java.util.Scanner;

class User
{
	String name, mId;
	void getUser()
	{
		System.out.println("--User Details--");
		System.out.println("User Name is : "+name);
		System.out.println("User Mail ID: " +mId);
	}
}


class DemoCon6 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		User ob = new User();

		System.out.println("Enter User Name:");
		ob.name = s.nextLine();

		System.out.println("Enter Mail Id:");
		ob.mId = s.nextLine();

		ob.getUser();

	}
}
