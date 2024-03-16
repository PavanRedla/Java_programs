// Demo on Constructors with same names for local varibales and instance variables


import java.util.Scanner;

class TrainDetails
{
	int trainNo;
	String trainName,fromStation,toStation,startTime,endTime;
	float fare;

	TrainDetails(int trainNo, String trainName, String fromStation, String toStation, String startTime, String endTime, float fare)
	{
		this.trainNo = trainNo;
		this.trainName =trainName;
		this.fromStation = fromStation;
		this.toStation = toStation;
		this.startTime = startTime;
		this.endTime = endTime;
		this.fare = fare;
	}	
	void getTrainDetails()
	{
		System.out.println("*** Train Registration Details ***");
		System.out.println("Train Number: " + trainNo);
		System.out.println("Train Name: " + trainName);
		System.out.println("From Station: " + fromStation);
		System.out.println("To Station: " + toStation);
		System.out.println("Train Start Time: " + startTime);
		System.out.println("Train End TIme: " + endTime);
		System.out.println("Train Ticket Cost: " + fare);
	}
}

class DemoCon5
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Train Number: ");
		int tNo = Integer.parseInt(s.nextLine());
		System.out.println("Enter the Train Name:");
		String tName = s.nextLine();
		System.out.println("Enter From Station: :");
		String fs = s.nextLine();
		System.out.println("Enter Tp Station:");
		String ts = s.nextLine();
		System.out.println("Enter Train Start Time:");
		String tStart = s.nextLine();
		System.out.println("Enter Train End Time:");
		String tEnd = s.nextLine();
		System.out.println("Enter the Ticket Cost:");
		float f = s.nextFloat();

		TrainDetails ob = new TrainDetails(tNo,tName,fs,ts,tStart,tEnd,f);
		ob.getTrainDetails();
	}
}
