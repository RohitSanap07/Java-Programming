package Encapsulation;

public class Mobile
{

	String brand;
	String name;
	double price;
	String type;
	Sim s;
	
	Mobile(){}
   
    Mobile(String brand,String name,double price,String type)
    {
    	 this.brand=brand;
    	 this.name=name;
    	 this.price=price;
    	 this.type=type;
    	 System.out.println("Mobile Created");
    	 
    }
    
    
    public void insertSim(String serviceProvider,String networkType,String type,long simno)
    {
    	s = new Sim(serviceProvider,networkType,type,simno);
    	
    	System.out.println("Sim Inserted");
    	
    }
    
    public void displayMobile()
    {
    	System.out.println("Brand : "+brand);
    	System.out.println("Name : "+name);
    	System.out.println("Price : "+price);
    	System.out.println("Type : "+type);
    }
    
}

