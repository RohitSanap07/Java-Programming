class AcDriver 
{
	public static void main(String[] args) 
	{
		Ac a = new Ac();

		a.brand="BlueStar";
		a.price=150000.0;
		a.ton=1.5;
		a.minTemp=30;
		a.maxTemp=60;
		a.currTemp=32;

		a.displayPrice();
		a.displayTon();
		a.displayPrice();
		a.displayMinTemp();
		a.displayMaxTemp();
		a.displaycurrTemp();

	}

}
