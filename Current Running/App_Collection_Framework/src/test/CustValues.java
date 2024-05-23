package test;

public class CustValues extends Object
{
	public String cName, city, mId;
	
	public CustValues(String cName, String city, String mId)
	{
		this.cName = cName;
		this.city = city;
		this.mId = mId;
	}
	@Override
	public String toString()
	{
		return cName + "\t" + city + "\t" +mId;
	}
}
