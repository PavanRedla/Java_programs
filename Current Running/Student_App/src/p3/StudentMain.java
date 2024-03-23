package p3;

import java.util.Scanner;
import p1.StudentData;
import p1.StudentContact;
import p2.StudentAddress;
import p2.StudentResult;

public class StudentMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		StudentData sd = new StudentData();
		StudentContact sc = new StudentContact();
		StudentAddress sa = new StudentAddress();
		StudentResult sr = new StudentResult();
		
		System.out.println("Enter Student Roll No: ");
		sd.rollNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter Student Name: ");
		sd.name = s.nextLine();
		System.out.println("Enter Student Branch : ");
		sd.branch = s.nextLine();
		
		System.out.println("Enter Student Phone: ");
		sc.phNo = Long.parseLong(s.nextLine());
		System.out.println("Enter Student Mail ID: ");
		sc.mId = s.nextLine();
		
		System.out.println("Enter Student House No: ");
		sa.hNo = s.nextLine();		
		System.out.println("Enter Student Name: ");
		sa.sName = s.nextLine();
		System.out.println("Enter Student City : ");
		sa.city = s.nextLine();
		System.out.println("Enter Student Pincode : ");
		sa.pinCode = s.nextInt();
		
		System.out.println("Enter Student Total Marks: ");
		sr.totalMarks = s.nextInt();	
		sr.per = (sr.totalMarks/600f) * 100;		
		
		sd.getStudentData();
		sc.getStudentContact();
		sa.getSutdentAddress();
		sr.getStudentResult();
		
		s.close();
	}

}
