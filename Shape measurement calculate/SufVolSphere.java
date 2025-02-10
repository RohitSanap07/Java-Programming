import java.util.Scanner;
class SufVolSphere 
{
	public static void main(String[] args) 
	{

     System.out.print("Enter a radius of sphere: ");

     float sphereRadius = new Scanner(System.in).nextFloat(); // Enter the radius 
     
	 // Calculating surface of sphere with formula (4*pi)*radius*radius
     float surface = (4 * 22/7f)*sphereRadius*sphereRadius; 

     // Calculating volume of sphere with formula (4/3*pi)*radius*radius*radius
     float volume = (4 / 3 * 22/7f)*sphereRadius*sphereRadius*sphereRadius;

     System.out.println("Surface of Sphere is: "+surface+" cm^2");
     System.out.println("Volume of Sphere is: "+volume+" cm^3");
   
  }
}
