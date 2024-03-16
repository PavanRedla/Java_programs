// Demo on Constructors with same names for local varibales and instance variables


import java.util.Scanner;

class UserReg
{
	String uName, pWord,fName,lName,add,mId;
	Long phNo;

	UserReg(String uName, String pWord, String fName, String lName, String add, String mId, Long phNo)
	{
		this.uName =uName;
		this.pWord = pWord;
		this.fName = fName;
		this.lName = lName;
		this.add = add;
		this.mId = mId;
		this.phNo = phNo;
	}	
	void getUserDetails()
	{
		System.out.println("*** User Registration Details ***");
		System.out.println("User Name: " + uName);
		System.out.println("User Password: " + pWord);
		System.out.println("User First Name: " + fName);
		System.out.println("User Last Name: " + lName);
		System.out.println("User Address: " + add);
		System.out.println("User Mail Id: " + mId);
		System.out.println("User Phno: " + phNo);
	}
}

class DemoCon4
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the User Name:");
		String uN = s.nextLine();
		System.out.println("Enter the Password :");
		String pW = s.nextLine();
		System.out.println("Enter the FirstName:");
		String fN = s.nextLine();
		System.out.println("Enter the LastName:");
		String lN = s.nextLine();
		System.out.println("Enter the address:");
		String a = s.nextLine();
		System.out.println("Enter the MailId:");
		String mI = s.nextLine();
		System.out.println("Enter the Phnumber:");
		Long pNo = s.nextLong();

		UserReg ob = new UserReg(uN, pW, fN, lN, a, mI, pNo);
		ob.getUserDetails();
	}
}
