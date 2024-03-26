package p1;

public class BankCustomer {
	public long accNo;
	public String name;
	
	public Contact ct = new Contact(); 
	public Account ac = new Account();
	
	public void getBankCustomer()
	{
		System.out.println("***Bank Customer***");
		System.out.println("AccNo: "+accNo);
		System.out.println("Name: "+name);
	}

}
