package p1;

public class User extends Object  // As a default every class will extends from one parent class called Object automatically.
{
	public String uName, mId;
	
	public User(String uName, String mId)
	{
		this.uName = uName;
		this.mId = mId;
	}
	
	public String toString()
	{
		return uName+"\t"+mId;
	}

}
