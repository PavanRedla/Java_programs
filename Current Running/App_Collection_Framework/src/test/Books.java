package test;

public enum Books 
{
	CoreJava(678.45F), AdvJava(123.45F), Spring(345.67F);
	public float price;
	private Books(float price)
	{
		this.price = price;
	}
	public final float getPrice()
	{
		return price;
	}
	public final void setPrice(float price)
	{
		this.price = price;
	}
}
