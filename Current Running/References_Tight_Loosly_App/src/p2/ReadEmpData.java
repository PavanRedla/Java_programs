package p2;
import java.util.Scanner;
import p1.*;

public class ReadEmpData 
{
	public Scanner s;
	public EmpData ed;
	
	public ReadEmpData(Scanner s, EmpData ed)
	{
		this.s =s;
		this.ed =ed;
	}
	
	public void read()
	{
		System.out.println("Enter Emp-ID: ");
		ed.id = s.nextLine();
		System.out.println("Enter Emp-Name: ");
		ed.name = s.nextLine();
		System.out.println("Enter Emp-Designation: ");
		ed.desg = s.nextLine();
		System.out.println("Enter Emp-Mail Id: ");
		ed.ec.mId = s.nextLine();
		System.out.println("Enter Emp-phNo: ");
		ed.ec.phNo = s.nextLong();
		System.out.println("Enter Emp-Basic Salary: ");
		ed.es.bSal = s.nextInt();
		ed.es.totSal = ed.es.bSal +(0.93f*ed.es.bSal) + (0.61f*ed.es.bSal);
	}
}
