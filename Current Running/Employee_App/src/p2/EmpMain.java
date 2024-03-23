package p2;
import java.util.Scanner;
import p1.EmpContact;
import p1.EmpData;
import p1.EmpSalary;

public class EmpMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmpData ed = new EmpData();
		EmpContact ec = new EmpContact();
		EmpSalary es = new EmpSalary();
		
		System.out.println("Enter Emp-ID: ");
		ed.id = s.nextLine();
		System.out.println("Enter Emp-Name: ");
		ed.name = s.nextLine();
		System.out.println("Enter Emp-Designation: ");
		ed.desg = s.nextLine();
		System.out.println("Enter Emp-Mail Id: ");
		ec.mId = s.nextLine();
		System.out.println("Enter Emp-phNo: ");
		ec.phNo = s.nextLong();
		System.out.println("Enter Emp-Basic Salary: ");
		es.bSal = s.nextInt();
		es.totSal = es.bSal +(0.93f*es.bSal) + (0.61f*es.bSal);
		
		ed.getEmpData();
		ec.getEmpContact();
		es.getEmpSalary();
		
	}

}
