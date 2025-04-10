package Encapsulation;

public class Refill {
	
	String color;
	double size;
	String refillType;
	Ink in;
	
	Refill(){}

	Refill(String color,double size,String refillType,String color1,double volume,String brand1)
	{
		in = new Ink(color1,volume,brand1);
		this.color = color;
		this.size = size;
		this.refillType = refillType;
		System.out.println("Refill is Created");
	}
	
	public void displayRefill()
	{
		System.out.println("Refill color : "+color);
		System.out.println("Refill size : "+size);
		System.out.println("Refill type : "+refillType);
		in.displayInk();
	}
}
