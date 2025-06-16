class Mango 
{
	double price ;
	String type ;
	String origin ;

	Mango()
	{}

	public Mango showPrice()
	{
		System.out.println(price);
		return this;
	}

	public Mango showType()
	{
		System.out.println(type);
		return this;
	}

    public Mango showOrigin()
	{
		System.out.println(origin);
		return this;
	}
}
