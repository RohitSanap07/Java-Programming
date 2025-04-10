package Encapsulation;

public class Ink {

	String color1 ;
	double volume;
	String brand1;
	
	Ink(){}
	
	Ink(String color1,double volume,String brand1){
		 this.color1=color1;
		 this.volume=volume;
		 this.brand1=brand1;
	}
	
	public void displayInk()
	{
		System.out.println("Ink color : "+color1);
		System.out.println("Ink volume : "+volume);
		System.out.println("Ink brand : "+brand1);
	}
	
	
	
}
