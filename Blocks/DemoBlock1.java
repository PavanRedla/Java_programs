// Construct program to demonstrate static block in Main class


class DemoBlock1 
{
	static int k;

	static
	{
		System.out.println("-- Static Block --");
		System.out.println("K value is : "+k);
	}
	public static void main(String[] args) 
	{
		k = 400;
		System.out.println("--Main() Method--");
		System.out.println("K value is : "+k);
	}
}
