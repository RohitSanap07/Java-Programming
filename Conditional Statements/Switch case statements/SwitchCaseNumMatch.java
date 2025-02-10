import java.util.Scanner;
class  SwitchCaseNumMatch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("----------WELCOME---------");
		System.out.println("Months in year: ");
		System.out.println("OCT");
        System.out.println("NOV");
		System.out.println("DEC");
        System.out.println("JAN");
        System.out.println("FEB");
        System.out.println("MAR");
        System.out.println("APR");
        System.out.println("MAY");
		System.out.println("JUN");
		System.out.println("JUL");
		System.out.println("AUG");
		System.out.println("SEP");

		System.out.print("Enter your choice: "); // Enter name of month as input

		String month = sc.next().toUpperCase(); // It convert any input of month to uppercase

		switch (month)
		{
			
		case "OCT":
		case "NOV":
	    case "DEC":
	    case "JAN":
        System.out.println("Winter"); // If input matches is winter 
		break;
		
		case "FEB":
		case "MAR":
	    case "APR":
	    case "MAY":
        System.out.println("Summer"); // If input matches is summer 
		break;

        case "JUN":
		case "JUL":
	    case "AUG":
	    case "SEP":
        System.out.println("Monsoon"); // If input matches is monsoon 
		break;

		default:
	    System.out.println("Invalid Month!"); // User entered another random word
        break;
		}

	}
}
