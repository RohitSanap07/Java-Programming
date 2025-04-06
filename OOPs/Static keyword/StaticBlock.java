class StaticBlock 
{ 
	static double pi = 22.0/7.0;
	public static void main(String[] args) 
	{
		areaOfCircle(100);
		circumferenceOfCircle(100);

	}

	public static void areaOfCircle(int rad)
	{
		double area = pi * (rad*rad);
		System.out.println(area);
	}

	public static void circumferenceOfCircle(int rad)
	{
		double crcm = 2 * pi * rad;
		System.out.println(crcm);
	}
}
