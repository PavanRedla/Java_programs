package p2;
import java.util.Scanner;
import static p1.Display.*; // only static members of a class are available, but classs not available.
import p1.Display; // Class is available to current running program.

public class DemoStatic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("---Static Members of Display---");
		System.out.println("Enter the value of b:");
		//Display.b=s.nextInt();
		b = s.nextInt();
		//Display.dis2();
		dis2();
		
		System.out.println("---Instance Members of Display---");
		Display d = new Display();
		System.out.println("Enter the value of a:");
		d.a=s.nextInt();
		d.dis1();
		
		s.close();
	}

}
