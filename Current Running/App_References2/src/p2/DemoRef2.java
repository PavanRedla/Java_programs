package p2;
import java.util.Scanner;
import p1.*;

public class DemoRef2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BookDetails bd = new BookDetails();
		
		ReadBookDetails rbd = new ReadBookDetails(s,bd);
		DisplayBookDetails dbd = new DisplayBookDetails(bd);
		
		rbd.read();
		dbd.display();

	}

}
