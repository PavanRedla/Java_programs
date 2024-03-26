package p3;

import java.util.Scanner;
import p1.StudentData;


public class StudentMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		StudentData sd = new StudentData();
		
		System.out.println("Enter Student Roll No: ");
		sd.rollNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter Student Name: ");
		sd.name = s.nextLine();
		System.out.println("Enter Student Branch : ");
		sd.branch = s.nextLine();
		
		System.out.println("Enter Student Phone: ");
		sd.sc.phNo = Long.parseLong(s.nextLine());
		System.out.println("Enter Student Mail ID: ");
		sd.sc.mId = s.nextLine();
		
		System.out.println("Enter Student House No: ");
		sd.sa.hNo = s.nextLine();		
		System.out.println("Enter Student Name: ");
		sd.sa.sName = s.nextLine();
		System.out.println("Enter Student City : ");
		sd.sa.city = s.nextLine();
		System.out.println("Enter Student Pincode : ");
		sd.sa.pinCode = s.nextInt();
		
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
			sd.sr.totalMarks = sd.sr.totalMarks + sub;
			i++;
		}

		sd.sr.per = (sd.sr.totalMarks/600f) * 100;
		float res = sd.sr.per;
		
		if (count>0)
		{
			sd.sr.grade = "Fail";
		}
		else
		{
			if (res>=70 && res<=100)
			{
				sd.sr.grade = "Distinction";
			}
			else if (res>=60 && res<70)
			{
				sd.sr.grade = "First-Class";
			}
			else if (res>=50 && res<60)
			{
				sd.sr.grade = "Second-Class";
			}
			else if (res>=35 && res<50)
			{
				sd.sr.grade = "Third-Class";
			}
			else
			{
				sd.sr.grade = "Fail";
			}
		}		
		
		sd.getStudentData();
		sd.sc.getStudentContact();
		sd.sa.getSutdentAddress();
		sd.sr.getStudentResult();
		
		s.close();
	}

}
