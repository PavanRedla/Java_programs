package p1;
import p2.*;

public class StudentData {
	public int rollNo;
	public String name;
	public String branch;
	
	public StudentContact sc = new StudentContact();
	public StudentAddress sa = new StudentAddress();
	public StudentResult sr = new StudentResult();
	
	public void getStudentData() {
		System.out.println("**STUDENT DATA**");
		System.out.println("Student Roll No: "+rollNo);
		System.out.println("Student Name: "+name);
		System.out.println("Student Branch : "+branch);
	}

}
