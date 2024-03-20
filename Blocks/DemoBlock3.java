// Construct program to demonstrate Instance block in Sub class


class BTest2
{
	int a;
	static int b;

	{
		a++;
		b++;
		System.out.println("-- Sub Class Instance Block --");
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
	}

	BTest2()
	{
		a++;
		b++;
		System.out.println("-- Sub Class Constructor --");
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
	}
	
	void dis()
	{
		a++;
		b++;
		System.out.println("-- Sub Class Instance method dis() --");
		System.out.println("a value is : "+a);
		System.out.println("b value is : "+b);
	}
}
class DemoBlock3
{
	public static void main(String[] args) 
	{
		System.out.println("-- Object-1 --");
		BTest2 ob1 = new BTest2();
		ob1.dis();

		System.out.println("-- Object-2 --");
		BTest2 ob2 = new BTest2();
		ob2.dis();
	}
}
