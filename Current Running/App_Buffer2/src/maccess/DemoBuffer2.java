package maccess;

public class DemoBuffer2 
{
	public static void main(String[] args) 
	{
		System.out.println("---StringBuffer(int)---");
		StringBuffer sb1 = new StringBuffer(8);
		System.out.println("default Capacity of sb1: "+sb1.capacity());
		System.out.println("length of sb1: "+sb1.length());
		
		sb1.append("java");
		System.out.println("data in sb1: "+sb1.toString());
		System.out.println("default Capacity of sb1: "+sb1.capacity());
		System.out.println("length of sb1: "+sb1.length());
		
		sb1.append(" "+"program");
		System.out.println("data in sb1: "+sb1.toString());
		System.out.println("default Capacity of sb1: "+sb1.capacity());
		System.out.println("length of sb1: "+sb1.length());
		
		System.out.println("---StringBuffer(String)---");
		StringBuffer sb2 = new StringBuffer("NIT");
		System.out.println("data in sb2: "+sb2.toString());
		System.out.println("default Capacity of sb2: "+sb2.capacity());
		System.out.println("length of sb2: "+sb2.length());
		
		System.out.println("---StringBuffer(CharSequence)---");
		StringBuffer sb3 = new StringBuffer("NIT-HYD");
		StringBuffer sb4 = new StringBuffer(sb3);
		System.out.println("data in sb4: "+sb4.toString());
		System.out.println("default Capacity of sb4: "+sb4.capacity());
		System.out.println("length of sb4: "+sb4.length());
		
		sb4.append(" java language program");
		System.out.println("data in sb4: "+sb4.toString());
		System.out.println("default Capacity of sb4: "+sb4.capacity());
		System.out.println("length of sb4: "+sb4.length());
	}
}
