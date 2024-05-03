package maccess;
import java.util.Scanner;

public class DemoString2 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		try(s;)
		{
			System.out.println("Enter the String: ");
			String str = s.nextLine();
			
			int len = str.length();
			for(int i=0; i<len-1; i++)
			{
				char ch = str.charAt(i);
				
				switch(ch)
				{
				case 'a':
				case 'A':
					System.out.print(ch+" ");
					break;

				case 'e':
				case 'E':
					System.out.print(ch+" ");
					break;

				case 'i':
				case 'I':
					System.out.print(ch+" ");
					break;

				case 'o':
				case 'O':
					System.out.print(ch+" ");
					break;

				case 'u':
				case 'U':
					System.out.print(ch+" ");
					break;
				}
			}
		}
	}

}
