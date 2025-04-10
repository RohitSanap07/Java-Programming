package Encapsulation;

public class Sim {
   
	String serviceProvider;
	String networkType;
	String type;
	long simno;
	
	public Sim(){}

	Sim(String serviceProvider,String networkType,String type,long simno)
	{
		this.serviceProvider=serviceProvider;
		this.networkType=networkType;
		this.type=type;
		this.simno=simno;
		
	}
	
	public void displaySim()
	{
		System.out.println("Service Provider : "+serviceProvider);
		System.out.println("Network Type : "+networkType);
		System.out.println("Type : "+type);
		System.out.println("Sim no : "+simno);
	}
	
}
