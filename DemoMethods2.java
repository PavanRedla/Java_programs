class Division
{
	static int x = 20;
	static int y = 10;

	static void div()
	{
		int z = x/y;
		System.out.println("Division method from Class Division");
		System.out.println("div="+z);
	}
}

class Substraction
{
	int a = 10;
	int b = 5;

	void sub()
	{
		int c = a-b;
		System.out.println("Substraction method from Substraction Class");
		System.out.println("sub="+c);
	}
}

class DemoMethods2 
{
	public static void main(String[] args) 
	{
		Division.div();

		Substraction obj = new Substraction();
		obj.sub();
	}
}
