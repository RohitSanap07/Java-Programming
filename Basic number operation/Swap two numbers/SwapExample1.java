class  SwappingExample1
{
	public static void main(String[] args) 
	{

	int a = 2;
	int b = 4;
    System.out.println("Before Swapping");
	System.out.println("a:"+ a);
	System.out.println("b:"+ b);
   
    a = a+b;  // Swapping two numbers without third variable
    b = a-b;
    a = a-b;
	
    System.out.println("After Swapping");
	System.out.println("a:"+ a);
	System.out.println("b:"+ b);


	}
}

