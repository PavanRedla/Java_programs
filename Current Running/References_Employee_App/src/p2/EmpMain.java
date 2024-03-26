package p2;
import java.util.Scanner;
import p1.EmpData;

public class EmpMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmpData ed = new EmpData();
		
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
		
		ed.getEmpData();
		ed.ec.getEmpContact();
		ed.es.getEmpSalary();
		
		s.close();
		
	}

}
