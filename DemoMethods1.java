class Arithmetic
{
	static int a = 10;
	static int b =20;
	int c = 30;

	static void add()
	{
		int x = a+b;
		System.out.println("add()");
		System.out.println("Sum="+x);
	}

	void mul()
	{
		int y = a*b*c;
		System.out.println("mul()");
		System.out.println("Mul="+y);
	}

}

class DemoMethods1 
{
	public static void main(String[] args) 
	{
		Arithmetic.add();
		Arithmetic ob = new Arithmetic();
		ob.mul();
	}
}
