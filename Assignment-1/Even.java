// <!-- Program-1
// Define a method which returns the 1 if the given number is even, in other case return 0
// Name of method: isEven() // which accepts an integer value as argument and return 1 if the
// given number is even, else retrun 0.
// Argument: int
// Return type: an integer value
// Example, if x = 22, return 1. if x = 35, return 0 -->

import java.util.Scanner;

class Even
{
	int isEven(int x)
	{
		if (x%2==0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();

		Even e = new Even();
		System.out.println(e.isEven(num));
		
	}
}
