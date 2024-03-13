// Program-4
// Define a method which returns the number it if it is an even number, if the number is odd then
// return the next multiple of 10.
// Write the method with the following specifications:
// Name of method: oddRounder() // which accepts an integer value as argument and return
// the same value if it is an even number, if the value is odd then return the next multiple of 10.
// Arguments: one argument of type integer
// Return Type: an integer value
// Example if x = 24 then return 24, if x = 25 then return 30.
// Specifications: The value returned by the method oddRounder() is determined by the
// following rules:

// If any of the given number is negative, return -1.
// If any of the given number is zero, return -2.
// If the given number is even, return the same number.
// If the given number is odd, return the next multiple of 10.

import java.util.Scanner;

class Rounder
{
	int oddRounder(int x)
	{
		if (x<0)
		{
			System.out.println("Given number is Negative, Hence returning -1: ");
			return -1;
		}
		else if(x==0)
		{
			System.out.println("Given number is zero, Hence returning -2: ");
			return -2;
		}
		else if(x%2==0)
		{
			System.out.println("Given number is Even, Hence returning the same number: ");
			return x;
		}
		else
		{
			System.out.println("Given number is Odd, Hence returning the next multiple of 10: ");
			return 10* ((x/10)+1);
		}
	}
	
}


class EvenOdd
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		Rounder ob = new Rounder();
		System.out.println(ob.oddRounder(num));
	}
}
