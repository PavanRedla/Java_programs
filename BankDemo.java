import java.util.Scanner;

class WithDraw
{
	void wDraw(int accBal, int withAmount)
	{
		System.out.println("Available account Balance is : "+accBal);
		System.out.println("Amount Withdrawn is: "+withAmount);
		System.out.println("Balance amount available is : "+(accBal-withAmount));
		System.out.println("Transaction Successful");
	}
}

class Deposit
{
	void depo(int accBal, int depoAmount)
	{
		System.out.println("Available account Balance is : "+accBal);
		System.out.println("Amount Deposited is: "+depoAmount);
		System.out.println("Balance amount available is : "+(accBal+depoAmount));
		System.out.println("Transaction Successful");
	}
}


class BankDemo 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int accBal = 2000;
		System.out.println("Enter Pin Number: ");
		int pin = s.nextInt();

		if (pin>=1111 && pin<=9999)
		{
			if ((pin == 1111) || (pin == 2222) || (pin == 3333) || (pin == 4444))
			{
				System.out.println("Select one of the following:");
				System.out.println("1.Withdraw\n2.Deposit");
				int choice = s.nextInt();

				switch (choice)
				{
					case 1:
						System.out.println("Enter the amount you want to withdraw in multiples of 100:");
						int withAmount = s.nextInt();
						if ((withAmount > 0) && (withAmount%100 == 0))
						{
							if (withAmount<=accBal)
							{
								WithDraw w = new WithDraw();
								w.wDraw(accBal, withAmount);
							}
							else
							{
								System.out.println("Insufficient Fund..");
							}
						}
						else
						{
							System.out.println("Invalid Amount");
						}
						break;
					case 2:
						System.out.println("Enter the amount you want to deposit in multiples of 100:");
						int depoAmount = s.nextInt();
						if ((depoAmount > 0) && (depoAmount%100 == 0))
						{
							Deposit d = new Deposit();
							d.depo(accBal, depoAmount);
						}
						else
						{
							System.out.println("Invalid Amount");
						}
						break;
					default: 
						System.out.println("Invalid Choice");			
				}
			}
			else
			{
				System.out.println("Wrong Pin Number!!!");
			}
		}
		else
		{
			System.out.println("Invalid Pin");
		}
	}
}
