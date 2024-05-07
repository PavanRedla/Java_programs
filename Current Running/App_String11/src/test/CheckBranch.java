package test;

public class CheckBranch 
{
	public boolean k = false;
	
	public boolean check(String branch)
	{
		switch(branch)
		{
		case "CSE" : k = true;
			break;
		case "ECE" : k = true;
			break;
		case "EEE" : k = true;
			break;
		}
		return k;
	}
}
