class DriverConstructorExmp1   
{
	public static void main(String[] args) 
	{
		ReturnStatement rs = new ReturnStatement("HP","Windows 11",512,50000.00);

		ReturnStatement rs1 = new ReturnStatement("Lenovo","Windows 12",512,60000.00);

		 rs.pcDetails();
		 rs1.pcDetails();
	}
}
