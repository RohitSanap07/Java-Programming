import java.util.Scanner;
class CelToFarh 
{
	public static void main(String[] args) 
	{

      Scanner sc = new Scanner (System.in);

	  System.out.print("Enter Tempreture in Degree: "); 

	  double celcius = sc.nextDouble(); // Taking input as tempreture in celcius

      double fahrenheit = (9/5) * celcius + 32; // Formula to convert degree celcius to fahrenheit

	  System.out.println("Tempreture in fahrenheit is: "+fahrenheit);

  }
}
