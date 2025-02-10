import java.util.Scanner;
class ScanExample 
{
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a bytenumber: ");
	  byte val1 = sc.nextByte();
      
	  System.out.print("Enter a shortnumber: ");
	  short val2 = sc.nextShort();

	  System.out.print("Enter a intnumber: ");
	  int val3 = sc.nextInt();
       
	  System.out.print("Enter a longnumber: ");
	  long val4 = sc.nextLong();

	  System.out.print("Enter a floatnumber: ");
	  float val5 = sc.nextFloat();

	  System.out.print("Enter a doublenumber: ");
	  double val6 = sc.nextDouble();


      System.out.println(val1);
	  System.out.println(val2);
	  System.out.println(val3);
	  System.out.println(val4);
	  System.out.println(val5);
	  System.out.println(val6);
}
}
