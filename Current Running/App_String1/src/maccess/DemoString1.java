package maccess;

public class DemoString1
{
	public static void main(String args[])
	{
		String s1 = "nit";
		String s2 = new String("program");
		System.out.println("---s1---");
		System.out.println("data in s1: "+s1.toString());
		System.out.println("data in s1 using reference: "+s1);
		int len1 = s1.length();
		System.out.println("Length of s1: "+len1);
		char ch1 = s1.charAt(1);
		System.out.println("char at index-1:"+ch1);
		
		System.out.println("---s2---");
		System.out.println("data in s2: "+s2.toString());
		System.out.println("data in s2 using reference: "+s2);
		int len2 = s2.length();
		System.out.println("Length of s2: "+len2);
		char ch2 = s2.charAt(4);
		System.out.println("char at index-4:"+ch2);
	
	}
}
