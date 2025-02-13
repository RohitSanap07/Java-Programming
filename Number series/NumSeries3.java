// Print the series 10,30,68,130...
// Series include cube of number and adding the number in cube
import java.util.Scanner;
class NumSeries3 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the range: ");
		int range = new Scanner(System.in).nextInt();

       for (int i = 2;i<=range ;i++)
		{
			int pow = 1;
			for (int j =1;j<=3 ;j++ )
			{
				pow *= i;
			}
				System.out.println((pow+i)+"  ");
				
			}
		
	
	}
}
