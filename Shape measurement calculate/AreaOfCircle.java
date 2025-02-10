import java.util.Scanner;
class AreaOFCircle 
{
	public static void main(String[] args) 
	{

       Scanner sc = new Scanner(System.in);

	   float r = sc.nextFloat(); // Taking radius as input

	   final float pi = 22/7f; // pi value makes unchange with final keyword

	   float area = pi *(r*r); // Formula for area of circle
			  
	   System.out.println("Area of circle is : ");
	}
}
