// Write a program to print below pattern:

// 5 
// 4 5
// 3 4 5
// 2 3 4 5 
// 1 2 3 4 5


class PatternDemo4
{
	public static void main(String[] args) 
	{
		for (int i=5;i>=1 ;i-- )
		{
			int count = i;
			for (int j=5;j>=i ;j-- )
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}
