package p1;

public class CClass extends PClass {
	public float calculate(int x, int y)
	{
		float rs = super.calculate(x, y); // Parent class method call
		System.out.println("Result: "+rs);
		System.out.println("***CClass Instance Method (Average)***");
		return (float) (x+y)/2;
	}
}
