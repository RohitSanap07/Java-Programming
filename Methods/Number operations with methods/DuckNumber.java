import java.util.Scanner;
class DuckNumber 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str = sc.next();

		System.out.println(duck(str)?"Duck number":"Not duck number");
	}

    public static boolean duck(String input)
	{
			return (input.contains("0")&&(input.charAt(0)!='0'));
	}
		
	 
	
}
