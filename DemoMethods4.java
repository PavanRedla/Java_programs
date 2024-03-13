import java.util.Scanner;
class StudentPercentage
{
	float Percentage(int s1, int s2, int s3, int s4, int s5, int s6)
	{
		int total = s1+s2+s3+s4+s5+s6;
		float p = (total/600) *100;
		return p;
	}
}

class DemoStudent 
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

		StudentPercentage ob = new StudentPercentage();
		float per = ob.Percentage(Telugu,English,Hindi,Maths,Science,Social);
		System.out.println("Percentage is : "+per);
	}
}
