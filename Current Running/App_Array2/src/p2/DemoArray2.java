package p2;
import p1.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Spliterator;

public class DemoArray2 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Employees: ");
		int n = Integer.parseInt(s.nextLine());
		
		EmployeeDetails ed[] = new EmployeeDetails[n];
		System.out.println("Enter "+ n +" Employee details: " );
		
		for(int i=0;i<ed.length;i++)
		{
			System.out.println("Enter the Employee Details -"+(i+1));
			System.out.println("Enter the EmpId: ");
			String eId = s.nextLine();
			System.out.println("Enter the EmpName: ");
			String eName = s.nextLine();
			System.out.println("Enter the EmpDeg: ");
			String eDeg = s.nextLine();
			System.out.println("Enter the Emp Basic Salary: ");
			int bSal = Integer.parseInt(s.nextLine());
			
			float hra = 0.91f*bSal;
			float da = 0.63f*bSal;
			float totSal = bSal + hra + da;
			
			ed[i] = new EmployeeDetails(eId, eName, eDeg, bSal, hra, da, totSal);
			
		}
		System.out.println("---Using Old for loop---");
		for(int i=0; i<ed.length; i++)
		{
			System.out.println(ed[i].toString());
		}
		
		System.out.println("---Using Extended for loop (Java5)---");		
		for (EmployeeDetails k : ed)
		{
			System.out.println(k.toString());
		}
		
		System.out.println("---Uisng Spliterator<T> (Java8)---");
		Spliterator<EmployeeDetails> se = Arrays.spliterator(ed);
		
		se.forEachRemaining((k)->
		{
			System.out.println(k.toString());
		});
		
		s.close();
	}

}
