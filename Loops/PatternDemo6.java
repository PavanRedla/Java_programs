// Write a program to print below pattern:

// 5 4 3 2 1 
// 5 4 3 2
// 5 4 3
// 5 4
// 5

import java.util.Scanner;

class PatternDemo6
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = s.nextInt();
		for (int i = n; i>=1 ; i--)
		{
			for (int j=n;j>=(n-i)+1 ;j-- )
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}
