package p1;

public class Hosteller extends Student
{
	public double hostellerFee = 45000;
	
	public String displayDetails()
	{
		return "HostellerFee: " +hostellerFee+
				"\nStudentId " +studentId+
				"\nStudentName: " +name+
				"\nExamFee: " +examFee;
	}
	
	public double payFee(int amt)
	{
		return amt - (hostellerFee+examFee);
	}

}
