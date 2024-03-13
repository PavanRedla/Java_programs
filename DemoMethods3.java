class Average
{
	float avg(int x, int y)
	{
		float z = (float)(x+y)/2;
		return z;
	}
}

class  DemoMethods3
{
	public static void main(String[] args) 
	{
		int v1 = 7;
		int v2 = 2;
		Average ob = new Average();
		float res = ob.avg(v1,v2);
		System.out.println("Average is: "+res);
	}
}
