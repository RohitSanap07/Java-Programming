class StaticVariable 
{
     static int a;

	public static void main(String[] args) 
	{
		int a = 20;
		System.out.println(StaticVariable.a);
		
		test();
	}

	public static void test()
	{
		System.out.println(a);
	}
}
