package test;

public class ProductDetails extends Object
{
	public String name;
	public float price;
	
	public ProductDetails(String name, float price)
	{
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return name+"\t"+price;
	}
}
