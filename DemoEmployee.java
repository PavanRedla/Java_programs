import java.util.Scanner;

class EmployeeSalary
{
	float calculate(float bsal, float hra, float da)
	{
		float total = bsal+hra+da;
		return total;
	}
}

class DemoEmployee 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Basic Salary:");
		float bsal = s.nextFloat();

		float hra = (93*bsal)/100;
		System.out.println("HRA is : "+ hra);

		float da = (61*bsal)/100;
		System.out.println("DA is : "+ da);

		EmployeeSalary ob = new EmployeeSalary();

		float totalSalary = ob.calculate(bsal,hra,da);

		System.out.println("Total Salary is : "+ totalSalary);
	}
}
