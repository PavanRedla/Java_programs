package p3;
import java.util.Scanner;
import p1.EmpData;
import p2.DisplayEmpData;
import p2.ReadEmpData;

public class EmpMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		EmpData ed = new EmpData();
		
		ReadEmpData red = new ReadEmpData(s,ed);
		DisplayEmpData ded = new DisplayEmpData(ed);
		
		red.read();
		ded.display();
		
		s.close();
		
	}

}
