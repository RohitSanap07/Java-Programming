package Encapsulation;

public class Car {

	
	 String name ;
	 double price;
	 double fuelCapecity;
	 String type1;
	 Engine e1;
	 
	 Car(){}
	 
	 Car(String name,double price,double fuelCapecity,String type1,
	     String type,double horsePower,String fuelType)
	 {
		 e1 = new Engine(type,horsePower,fuelType);
		 this.name=name;
		 this.price=price;
		 this.fuelCapecity=fuelCapecity;
		 this.type1=type1;
		 
	 }
	 
	 public void displayCar()
	 {
		 System.out.println("Car Name : "+name);
		 System.out.println("Car Price : "+price);
		 System.out.println("Fuel Capecity : "+fuelCapecity);
		 System.out.println("Car type : "+type1);
		 e1.displayEngine();
	 }

	 
}
