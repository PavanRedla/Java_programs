package p2;
import p1.*;
public class DemoThread1 
{

	public static void main(String[] args) 
	{
		Register ob1 = new Register();
		Login ob2 = new Login();
		
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		
		t1.start(); // call run() method from Register Object
		t2.start();	// call run() method from Login Object

	}

}
