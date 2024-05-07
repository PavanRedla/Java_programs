package maccess;
import java.util.*;
import test.CheckBranch;
import test.GenerateBranch;
import test.StudentResult;
@SuppressWarnings("serial")
public class DemoString11 extends Exception
{
	public DemoString11(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			try
			{
				System.out.println("Enter the Student Branch: ");
				String branch = s.nextLine().toUpperCase();
				CheckBranch cb = new CheckBranch();
				boolean k = cb.check(branch);
				if(!k)
				{
					DemoString11 ob = new DemoString11("Invalid Branch...");
					throw ob;
				}
				System.out.println("Enter the Student RollNo: ");
				String rollNo = s.nextLine();
				if(rollNo.length()!=10)
				{
					DemoString11 ds = new DemoString11("Invalid RollNo...");
					throw ds;
				}
				String brCode = rollNo.substring(6,8);
				GenerateBranch gb = new GenerateBranch();
				String br = gb.generate(brCode);
				if(br==null)
				{
					DemoString11 ds = new DemoString11(" RollNo holding Invalid Branch Code...");
					throw ds;					
				}
				if(!(branch.equals(br)))
				{
					DemoString11 ds = new DemoString11("RollNo not belongs to Branch...");
					throw ds;
				}
				System.out.println("Branch: "+branch);
				System.out.println("Roll Number: "+rollNo);
				
				StudentResult sr = new StudentResult();
				
				
				int i = 1;
				int sub =0;
				int count =0;
				while(i<=6)
				{
					System.out.println("Enter the marks of subject-"+i);
					sub = Integer.parseInt(s.nextLine());
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
				
				sr.getStudentResult();
				
				
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

}
