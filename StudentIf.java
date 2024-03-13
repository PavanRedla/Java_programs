import java.util.Scanner;

class StudentPerIf
{
	float Percentage(int s1, int s2, int s3, int s4, int s5, int s6)
	{
		int total = s1+s2+s3+s4+s5+s6;
		float p = (total/6.0f);
		return p;
	}
}

class StudentIf 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Telugu Marks:");
		int Telugu = s.nextInt();
		System.out.println("Enter English Marks:");
		int English = s.nextInt();
		System.out.println("Enter Hindi Marks:");
		int Hindi = s.nextInt();
		System.out.println("Enter Maths Marks:");
		int Maths = s.nextInt();
		System.out.println("Enter Science Marks:");
		int Science = s.nextInt();
		System.out.println("Enter Social Marks:");
		int Social = s.nextInt();
		
		if ((Telugu>=0 && Telugu<=100) && (English>=0 && English<=100) && (Hindi>=0 && Hindi<=100) && (Maths>=0 && Maths<=100) && (Science>=0 && Science<=100) && (Social>=0 && Social<=100))
		{
			StudentPerIf ob = new StudentPerIf();
			float per = ob.Percentage(Telugu,English,Hindi,Maths,Science,Social);
			System.out.println("Percentage is : "+per);
		}
		else
		{
			System.out.println("Invalid Marks entered, Kindly enter the correct Marks");
		}
		
	}
}
