// Program-5
// Define a method which returns the 1 if the given number is positive, return -1 if the given
// number is negative, return 0 if the given number is 0.
// Name of method findSign()
// Arguments: one argument of type integer
// Return Type: an integer value
// Test Cases
// 1. If any of the given number is positive, return 1.
// 2. If any of the given number is negative, return -1.
// 3. If any of the given number is zero, return 0.


import java.util.Scanner;

class FindSign
{
	int findSign(int x)
	{
		if (x<0)
		{
			System.out.println("Given number is Negative, Hence returning -1: ");
			return -1;
		}
		else if(x==0)
		{
			System.out.println("Given number is zero, Hence returning 0: ");
			return 0;
		}
		else
		{
			System.out.println("Given number is Positive, Hence returning 1: ");
			return x;
		}
	}
}

class Sign
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		FindSign ob = new FindSign();
		System.out.println(ob.findSign(num));
	}
}
