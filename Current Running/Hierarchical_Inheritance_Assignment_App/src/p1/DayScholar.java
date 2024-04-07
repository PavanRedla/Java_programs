package p1;

public class DayScholar extends Student
{
	public double transportFee = 23000;
	
	public String displayDetails()
	{
		return "TransportFee: " +transportFee+
				"\nStudentId " +studentId+
				"\nStudentName: " +name+
				"\nExamFee: " +examFee;
	}
	
	public double payFee(int amt)
	{
		return amt - (transportFee+examFee);
	}

}
