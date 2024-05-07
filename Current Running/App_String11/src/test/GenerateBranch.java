package test;

public class GenerateBranch 
{
	public String br = null;
	public String generate(String brCode)
	{
		switch(brCode)
		{
		case "01": br = "IT";
			break;
		case "02": br = "EEE";
			break;
		case "03": br = "MECH";
			break;
		case "04": br = "ECE";
			break;
		case "05": br = "CSE";
			break;
		}
		return br;
	}
}
