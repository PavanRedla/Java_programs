// Program-2
// Define a method which returns the greatest number among two numbers.
// Write the method with the following specifications:
// Name of method: getGreatest() // which accepts two integer values as argument and return
// the greatest value.
// Arguments: two argument of type integer
// Return type: an integer value
// Specifications: The value returned by the method getGreatest() is determined by the following
// rules:
// If any of the given numbers are negative, return -1.
// If any of the given numbers are zero, return -2.
// If the given numbers are positive, return the greatest.



import java.util.Scanner;

class CalculateGreatest
{
	int getGreatest(int x, int y)
	{
		if (x<0 || y<0)
		{
			return -1;
		}
		else if(x==0 || y==0)
		{
			return -2;
		}
		else if(x>y)
		{
			return x;
		}
		else
		{
			return y;
		}
		
	}
}

class Greatest
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num-1:");
		int num1 = s.nextInt();
		System.out.println("Enter num-2:");
		int num2 = s.nextInt();

		CalculateGreatest ob = new CalculateGreatest();
		System.out.println(ob.getGreatest(num1, num2));
	}
}
