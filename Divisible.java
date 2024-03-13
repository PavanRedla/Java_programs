import java.util.Scanner;

class Divisible 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the dividend: ");
		int dividend = s.nextInt();
		System.out.println("Enter the divisor:");
		int divisor = s.nextInt();

		if ((dividend % divisor) == 0)
		{
			System.out.println(dividend + " is a multiple of "+divisor);
		}
		else
		{
			System.out.println(dividend + " is not a multiple of "+divisor);
		}
	}
}
