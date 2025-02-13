class  SwappingExample
{
  public static void main(String[] args) 
   {

	int a = 2;
	int b =4;

    System.out.println("Before Swapping");
	System.out.println("a:"+ a);
	System.out.println("b:"+ b);

	int temp = a; // Swapping two numbers with third variable
	a = b;
	b = temp;

	System.out.println("After Swapping");
	System.out.println("a:"+ a);
	System.out.println("b:"+ b);


	}
}
