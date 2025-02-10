import java.util.Scanner;
class IfElseTaxSlab
{
	public static void main(String[] args) 
	{
		System.out.print("Enter your salary: ");

		int sal = new Scanner(System.in).nextInt(); //salary taken as input
        
		if (sal<0)
		{
          System.out.println("Enter valid salary"); //salary check is it valid 
		}

        else if (sal<400000)
        {
          System.out.println(sal+" is Tax free Amount!!"); // This is tax free amount
        }

		else if (sal>400000 && sal<=800000) 
        { 
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.05))); //Tax applied on this salary
        }

		else if (sal>800000 && sal<=1200000)
        {
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.10))); // Applied tax cut from salary
        }

		else if (sal>1200000 && sal<=1600000)
        {
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.15)));
        }
		       
	    else if (sal>1600000 && sal<=2000000)
        {
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.20)));
        }

		else if (sal>2000000 && sal<=2400000)
        {
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.25)));
        }


        else if (sal>2400000)
        {
          System.out.println("Your salary is: "+sal+" In hand salary is: "+(sal-(sal*0.30)));
        }

		System.out.println("Pay Your Tax, Build the Nation!"); // At the end slogan is printing  

	}
}
