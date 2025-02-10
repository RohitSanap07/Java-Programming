import java.util.Scanner;
class BmiCalculate 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Weight in pounds:"); // Taking weight as input in pounds

		float weight = sc.nextFloat()*0.45359237f; // 1 pund is 0.45359237 kg

		System.out.print("Enter Heigth in inches: "); // Taking height as input in inches

		float height = sc.nextFloat()*0.0254f; // 1 inch is 0.0254 meter

		float bmi = weight /(height*height); // Formula for bmi calculate

		System.out.println("BMI is "+bmi+" for Weigth in pounds : "+weight+" and Heigth in Inches "+ height);

}
}
