// Write a program to read a number and display the factorial of a given number

import java.util.Scanner;

class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = s.nextInt();
		int fact = 1;

		for (int i = n;i>=1 ;i-- )
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
}
