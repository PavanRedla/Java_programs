package maccess;
import java.util.*;
public class DemoString8 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "language";
		String s3 = "programming";
		
		System.out.println("---Using + symbol---");
		String s4 = s1+" "+s2+" "+s3;
		System.out.println("data in s4: "+s4.toString());
		
		System.out.println("---Using concat() method---");
		String s5 = s1.concat(" "+s3);
		String s6 = s1.concat(" "+s2).concat(" "+s3);
		System.out.println("data in s5: "+s5.toString());
		System.out.println("data in s5: "+s6.toString());
		
		System.out.println("---hashCodes---");
		System.out.println("hashCode of s1: "+s1.hashCode());
		System.out.println("hashCode of s2: "+s2.hashCode());
		System.out.println("hashCode of s3: "+s3.hashCode());
		System.out.println("hashCode of s4: "+s4.hashCode());
		System.out.println("hashCode of s5: "+s5.hashCode());
		System.out.println("hashCode of s6: "+s6.hashCode());
	}
}
