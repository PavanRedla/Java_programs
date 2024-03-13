import java.util.Scanner;

class Addition
{
	int add (int x, int y)
	{
		return x+y;
	}
}

class Substraction
{
	int sub (int x, int y)
	{
		return x-y;
	}
}

class Multiplication
{
	int mul(int x, int y)
	{
		return x*y;
	}
}

class Division
{
	int div(int x, int y)
	{
		return x/y;
	}
}

class ModDivision
{
	int modDiv(int x, int y)
	{
		return x%y;
	}
}

class SwitchDemo1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value-1");
		int v1 = s.nextInt();
		System.out.println("Enter value-2");
		int v2 = s.nextInt();
		System.out.println("Select one of the below choices");
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.ModDiv");
		System.out.println("Enter Choice");
		int choice = s.nextInt();

		switch (choice)
		{
			case 1:
				Addition ad = new Addition();
				int res1 = ad.add(v1,v2);
				System.out.println("Sum is : "+res1);
				break;
			case 2:
				Substraction sb = new Substraction();
				int res2 = sb.sub(v1,v2);
				System.out.println("Sub is : "+res2);
				break;
			case 3:
				Multiplication ml = new Multiplication();
				int res3 = ml.mul(v1,v2);
				System.out.println("Mul is : " +res3);
				break;
			case 4:
				Division di = new Division();
				int res4 = di.div(v1,v2);
				System.out.println("Quotient is : " +res4);	
				break;
			case 5: 
				ModDivision md = new ModDivision();
				int res5 = md.modDiv(v1,v2);
				System.out.println("Remainder is : " + res5);
				break;
			default:
				System.out.println("Invalid Choice..");
		}
	}
}
