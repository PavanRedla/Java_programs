package p1;

public class Access     // Outer Class
{
	public ITest getRef()  // OuterClass Instance Method
	{
		ITest ob = (int a)->
		{
			System.out.println("***LambdaExpression for dis1(int a)***");
			System.out.println("The value of a: "+a);
		};
		return ob;
	}
}
