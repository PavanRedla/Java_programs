import java.util.Scanner;

class EmployeeSal
{
	float calculate(int bsal, float hra, float da)
	{
		float total = bsal+hra+da;
		return total;
	}
}

class Employee 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Basic Salary:");
		int bsal = s.nextInt();

		if (bsal>=12000)
		{
			float hra = (93*bsal)/100;
			System.out.println("HRA is : "+hra);

			float da = (61*bsal)/100;
			System.out.println("DA is : "+da);

			EmployeeSal ob = new EmployeeSal();

			float totalSalary = ob.calculate(bsal,hra,da);

			System.out.println("Total Salary is : "+ totalSalary);
		}
		else 
		{
			System.out.println("Invalid Basic Salary");
		}
		 
	}
}
