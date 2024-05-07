package maccess;

public class DemoBuffer1 
{
	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("default Capacity: "+sb.capacity());
		System.out.println("length of sb: "+sb.length());
		
		sb.append("language");
		System.out.println("data in sb : "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("length of sb: "+sb.length());
		
		sb.append(" "+"java");
		System.out.println("data in sb : "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("length of sb: "+sb.length());
		
		sb.append(" "+"program");
		System.out.println("data in sb : "+sb.toString());
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("length of sb: "+sb.length());
	}
}
