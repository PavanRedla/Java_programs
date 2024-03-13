// Write a program to print whether the given number is Palindrome or not

// The number which is equal to it's reverse is called Palindrome number


import java.util.Scanner;

class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = s.nextInt();
		int originalNumber = n;

		int k =0, rev =0;

		while(n>0)
		{
			k = n%10;
			rev = (rev*10) + k;
			n = n/10;
		}
		if (originalNumber == rev)
		{
			System.out.println("Given number is a Palindrome number");
			System.out.println("Original number is " +originalNumber);
			System.out.println("Reverse of Original number is " +rev);
		}
		else
		{
			System.out.println("Given number is not a Palindrome number");
			System.out.println("Original number is " +originalNumber);
			System.out.println("Reverse of Original number is " +rev);
		}


	}
}
