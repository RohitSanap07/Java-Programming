import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Radius: ");

		float radius = sc.nextFloat(); // Enter radius as input

		final float pi = 22/7; // Value of pi that makes constant with final keyword
		float area = pi * (radius * radius); // Calculating area of cylinder with formula pi*(radius*radius)
		
        System.out.print("Enter the Height: ");
	    float height = sc.nextFloat(); // Enter the height

	    float volume = area * height; // Calculating volume of cylinder with formula area*height
        System.out.println("Area of Cylinder is:"+area+"cm^2" + " and Volume of Cylinder is: "+ volume+"cm^3");
	    
	}
}
