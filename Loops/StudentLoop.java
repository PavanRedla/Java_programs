// Write a program to read the marks of 6 subjects of a student and calculate total marks, percentage, pass class (Distinction, ..... ,Fail)
// Note:
// 1. if one subject marks is in between 0 and 34 then pass class is Fail
// 2. if the marks entered is greater than 100 or less than 0 then print invalid marks and again ask the user to enter the marks.



import java.util.Scanner;

class StudentResult
{
	String generate(float per)
	{
		if(per>=70 && per<=100)
		{
			return "Distinction";
		}
		else if(per>=60 && per<70)
		{
			return "First Class";
		}
		else if(per>=50 && per<60)
		{
			return "Second Class";
		}
		else if(per>=35 && per<50)
		{
			return "Third Class";
		}
		else
		{
			return "Fail";
		}
	}
}


class StudentLoop 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int i =1, totalM = 0;
		int count =0;
		while(i<=6)
		{
			System.out.println("Enter the marks of subject-"+i);
			int sub = s.nextInt();
			if (sub<0 || sub>100)
			{
				System.out.println("Please enter valid marks!!!");
				continue;
			}
			if (sub>=0 && sub<=34)
			{
				count++;
			}
			totalM = totalM + sub;
			i++;
		}
		System.out.println("Total Marks:"+totalM);

		float per = totalM/6.0f;
		System.out.println("Percentage is : " +per);
		
		if (count>0)
		{
			System.out.println("Pass-class: Fail");
		}
		else
		{
			StudentResult sr = new StudentResult();
			String res = sr.generate(per);
			System.out.println("Pass-class: "+res);
		}
		
	}
}
