package Encapsulation;

public class Engine {
	
	String type;
	double horsePower;
	String fuelType;
	
	Engine(){}

	Engine(String type,double horsePower,String fuelType)
    {
		this.type = type;
		this.horsePower = horsePower;
		this.fuelType = fuelType;
    }
	
	public void displayEngine()
	{
		System.out.println("Engine Type : "+type);
		System.out.println("Engine HP : "+horsePower);
		System.out.println("Engine Fuel : "+fuelType);
	}
	
	
	}
