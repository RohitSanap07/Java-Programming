package Encapsulation;

public class Pen {
	
	String brand;
	double price;
	String type;
	Refill rf;
	
   public Pen()
 {
	 
	 }
 
    Pen(String brand,double price,String type,String color1,
    		double volume,String brand1,String color,double size,String refillType )
    {
    	rf = new Refill (color,size,refillType,color1,volume,brand1);
    	this.brand = brand;
    	this.price=price;
    	this.type = type;
    	System.out.println("Pen Created");
    	
    }
    
    public void displayPen()
    {
    	System.out.println("Pen brand : "+brand);
    	System.out.println("Pen price : "+price);
    	System.out.println("Pen type : "+type);
    	rf.displayRefill();
    
    	
    	
    }


	
}
