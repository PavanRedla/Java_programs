// Loading data to objects using Setter Methods

import java.util.Scanner;

class Details
{
	String name;
	float price;

	void setName(String name)
	{
		this.name = name;
	}

	void setPrice(float price)
	{
		this.price = price;
	}

	String getName()
	{
		return name;
	}

	float getPrice()
	{
		return price;
	}
}

class DemoCon7 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		Details ob = new Details();

		System.out.println("Enter Product Name: ");
		ob.setName(s.nextLine());

		System.out.println("Enter Product Cost: ");
		ob.setPrice(s.nextFloat());

		System.out.println("--Details--");

		System.out.println("Product Name: "+ob.getName());

		System.out.println("Product Cost: "+ob.getPrice());
		
	}
}
