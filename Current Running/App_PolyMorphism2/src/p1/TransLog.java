package p1;
import java.util.*;

public final class TransLog 
{
	private final long hAccNo;
	private final long bAccNo;
	private final float amt;
	private final Date dateTime;
	
	public TransLog(long hAccNo, long bAccNo, float amt, Date dateTime)
	{
		this.hAccNo = hAccNo;
		this.bAccNo = bAccNo;
		this.amt = amt;
		this.dateTime = dateTime;
	}

	public final long gethAccNo() {
		return hAccNo;
	}

	public final long getbAccNo() {
		return bAccNo;
	}

	public final float getAmt() {
		return amt;
	}

	public final Date getDateTime() {
		return dateTime;
	}
	
	
}
