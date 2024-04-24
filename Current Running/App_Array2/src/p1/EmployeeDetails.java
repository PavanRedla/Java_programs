package p1;

public class EmployeeDetails
{
	String eId, eName, eDeg;
	float hra, da, totSal;
	int bSal;
	
	public EmployeeDetails(String eId, String eName, String eDeg, int bSal, float hra, float da, float totSal)
	{
		this.eId = eId;
		this.eName = eName;
		this.eDeg = eDeg;
		this.bSal = bSal;
		this.hra = hra;
		this.da = da;
		this.totSal = totSal;
	}
	
	public String toString()
	{
		return eId+"\t"+eName+"\t"+eDeg+"\t"+bSal+"\t"+hra+"\t"+da+"\t"+totSal;
	}

}
