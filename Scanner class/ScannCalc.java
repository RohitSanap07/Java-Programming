import java.util.Scanner;
class ScannCalc
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner (System.in);
		System.out.println("Addition of two numbers");
		System.out.print("Enter first number:");
		int add1 = sc.nextInt();
        System.out.print("Enter second number:");
		int add2 = sc.nextInt();
        
		System.out.print("Result:");
		int sum = add1 + add2;
		System.out.println(sum);

        System.out.println("Subtraction of two numbers");
		System.out.print("Enter first number:");
		int sub1 = sc.nextInt();
        System.out.print("Enter second number:");
		int sub2 = sc.nextInt();
        
		System.out.print("Result:");
		int sub = sub1 - sub2;
		System.out.println(sub);

        System.out.println("Multiplication of two numbers");
		System.out.print("Enter first number:");
		int mult1 = sc.nextInt();
        System.out.print("Enter second number:");
		int mult2 = sc.nextInt();
        
		System.out.print("Result:");
		int mult = mult1 * mult2;
		System.out.println(mult);

		System.out.println("Division of two numbers");
		System.out.print("Enter first number:");
		int Div1 = sc.nextInt();
        System.out.print("Enter second number:");
		int Div2 = sc.nextInt();
        
		System.out.print("Result:");
		int Div = Div1 / Div2;
		System.out.println(Div);

        System.out.println("Modulus of two numbers");
		System.out.print("Enter first number:");
		int Mod1 = sc.nextInt();
        System.out.print("Enter second number:");
		int Mod2 = sc.nextInt();
        
		System.out.print("Result:");
		int Mod = Mod1 % Mod2;
		System.out.println(Mod);
}
}
