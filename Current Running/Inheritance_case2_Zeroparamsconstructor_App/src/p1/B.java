package p1;

public class B extends A {
	public int b=200;
	
	public B()
	{
		// super();
		System.out.println("***Child class Constructor B()");
		System.out.println("Parent class Variable a :"+a);
		System.out.println("Child class Variable b :"+b);
	}

}
