// Write a program to read student name, branch and roll number and display the same

// Conditions:

// the branch must be among ECE OR CSE OR EEE , else "Invalid Branch"
// If the branch is verified successfully, then read rollno.


import java.util.Scanner;

class BranchCheck
{
	boolean verify(String branch)
	{
		return switch(branch)
		{
			case "CSE" : yield true;
			case "EEE" : yield true;
			case "ECE" : yield true;
			default : yield false;
		};
	}
}

class NewSwitchDemo
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student Name:");
		String name = s.nextLine();

		System.out.println("Enter branch name: ");
		String branch = s.nextLine();

		BranchCheck bc = new BranchCheck();
		boolean b = bc.verify(branch);

		if (b == true)
		{
			System.out.println("Enter Student roll no: ");
			String rollNo = s.nextLine();
			System.out.println("Student Details are:");
			System.out.println("Student Name is :" + name);
			System.out.println("Student branch is :"+branch);
			System.out.println("Student roll number is:" +rollNo);
		}
		else
		{
			System.out.println("Invalid Branch");
		}
	}
}
