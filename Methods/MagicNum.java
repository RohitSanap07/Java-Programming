import java.util.Scanner;
class MagicNum
{
	public static void main(String []args)
	{

	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number: ");
	  int num = sc.nextInt();
      System.out.println(isMagic(55)?"Magic number":"Not magic number");

	}

	public static int add(int n1,int sum)
	{
		if(n1==0)
		{
			return sum;
		}
		sum += (n1%10);
		return add(n1/10,sum);
	}

	public static boolean isMagic(int num)
	{
		int sum = add(num,0);
       
		if (num>0)
		{
			sum = add(sum,0);

		}
		return sum==1;
	}

}