// Write a program to read a number and display the sum of even digits from the given number.


import java.util.Scanner;

class EvenDigitSum 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the num value: ");
		int n = s.nextInt();

		int k =0, sum = 0;

		while(n>0)
		{
			k = n%10;
			if (k%2==0)
			{
				sum = sum+k;	
			}
			n = n/10;
		}
		System.out.println("Sum of Even Digits in a given number is : "+sum);
	}
}
