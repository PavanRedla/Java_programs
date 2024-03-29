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
		
		int i = 1;
		int sub =0;
		int count =0;
		while(i<=6)
		{
			System.out.println("Enter the marks of subject-"+i);
			sub = s.nextInt();
			if (sub<0 || sub>100)
			{
				System.out.println("Please enter valid marks!!!");
				continue;
			}
			if (sub>=0 && sub<=34)
			{
				count++;
			}
			sr.totalMarks = sr.totalMarks + sub;
			i++;
		}

		sr.per = (sr.totalMarks/600f) * 100;
		float res = sr.per;
		
		if (count>0)
		{
			sr.grade = "Fail";
		}
		else
		{
			if (res>=70 && res<=100)
			{
				sr.grade = "Distinction";
			}
			else if (res>=60 && res<70)
			{
				sr.grade = "First-Class";
			}
			else if (res>=50 && res<60)
			{
				sr.grade = "Second-Class";
			}
			else if (res>=35 && res<50)
			{
				sr.grade = "Third-Class";
			}
			else
			{
				sr.grade = "Fail";
			}
		}		
		
		sd.getStudentData();
		sc.getStudentContact();
		sa.getSutdentAddress();
		sr.getStudentResult();
		
		s.close();
	}

}
