class DemoVariables
{
	static int a = 10; // static/class variable 
	int b = 20;        // Instance/Object variable as it is declared outside the method without static keyword

	static void dis1()
	{
		// this static method/class method, so it can access only the static variables.
		System.out.println("dis1");
		System.out.println("a value is:"+a);
	}

	void dis2()
	{
		// this is a non static/Instance/Object method, this can access both static variables and non static variables
		System.out.println("dis2");
		System.out.println("a value is:" +a);
		System.out.println("b value is:" +b);
	}

	public static void main(String[] args) 
	{
		int c = 30; // Local/Method variable as it is declared inside the method without static keyword
		System.out.println("Main()");
		System.out.println("a value is :" +a);
		System.out.println("c value is :" +c);
		dis1(); // this method is a static method and can access the static methods directly.
	
		// this method is a static method and cannot access non static method (dis2()),
		// inorder to access it we need to create object for the class and using object we can access the non static methods.
		DemoVariables ob = new DemoVariables();
		ob.dis2();
	}
}
