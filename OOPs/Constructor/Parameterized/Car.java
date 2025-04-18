class Car 
{
	String brand ;
	String model ;
	String color ;
	int year ;
	double engineCapacity ;
	String transmission ;

	Car(){}

	Car(String brand,String model)
	{
		this.brand = brand;
		this.model=model;
		System.out.println("Constructor 1");
	}

	Car(String brand,String model,String color)
	{
		this(brand,model) ;
		this.color=color;
		System.out.println("Constructor 2");
	}

	Car(String brand,String model,String color,int year,double engineCapacity)
	{
		this(brand,model,color) ;
		this.year=year;
		this.engineCapacity=engineCapacity;
		System.out.println("Constructor 3");
	}

	Car(String brand,String model,String color,int year,double engineCapacity,String transmission)
	{
		this(brand,model,color,year,engineCapacity);
		this.transmission = transmission;
		System.out.println("Constructor 4");
	}

	public void carDetails()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
        System.out.println("Color : "+color);
		System.out.println("Year : "+year);
		System.out.println("Engine Capacity : "+engineCapacity);
		System.out.println("transmission : "+transmission);
		System.out.println("--------------------------------------");
	}

}
