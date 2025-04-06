class ConstructorExmp1 
{
	String brand ;
    String gen ;
	int memory ;
	double price ;

	ReturnStatement(String brand,String gen,int memory,double price )
	{
		this.brand = brand;
		this.gen = gen;
		this.memory = memory;
		this.price = price;
	}

    public void pcDetails(){
  
	System.out.println(brand);
	System.out.println(gen);
	System.out.println(memory);
	System.out.println(price);
	}
}
