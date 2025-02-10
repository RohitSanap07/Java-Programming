import java.util.Scanner;
class Bank
{
    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);

		// Initially variable with 0 and null values

		String username = null;
		String password = null;
		double deposite = 0;
		double withdraw = 0;
		double balance = 0;
        
		// Starts a infinite loop 
        for (  ;   ;  )
        {

        System.out.println("\n       --->WELCOME<---");
        System.out.println("	  JANSEVA BANK ");
		System.out.println("*");
        System.out.println("\n 1. LOGIN ");
        System.out.println("\n 2. CREATE ACCOUNT");
        System.out.print("\n Please Choose an option :");

        int opt = sc.nextInt(); // Choose one of option

        if (opt==1) // For option one executing this 
		{
		  if (username == null) // If username not created 
		{
		  System.out.println(" \n Create account before login ");
		  continue; // continue use to return to option 
		}
			
	    for (int i = 3;1>0 ;i-- ) 
		{

        System.out.print("\n ENTER USERNAME :");
		String username2 = sc.next(); // Enter username as input

		System.out.print("\n ENTER PASSWORD :");
		String password2 = sc.next(); // Enter password as input
        
		// Username is created and matches then go to home page
		if (username2.equals(username) && password2.equals(password)) 
		{
		   Home :

		for (  ;  ;  )
				
		{
        
		// Options given in home page
		System.out.println(" \n HOME ");
		System.out.println(" \n 1. Deposit  ");
		System.out.println(" \n 2. Withdraw ");
		System.out.println(" \n 3. Check Balance ");
		System.out.println(" \n 4. Mini Statement  ");
		System.out.println(" \n 5. Logout ");
		System.out.println(" \n \n Enter the option : ");
					
		int opt2 = sc.nextInt();

		switch (opt2)
		{
		case 1:
		{
		// deposite
        System.out.println(" \n Enter Amount to deposite :  ");
		deposite = sc.nextDouble();
		balance += deposite; // To add amount to balance
	    System.out.println(" \n Deposite Successfull.. ");
	    continue Home;

		}
					
		case 2:
		{
		//withdraw

		System.out.println(" \n Enter amount to Withdraw :  ");
		withdraw = sc.nextDouble();
							
		for (int j=3;j>0 ; j--) // To give only 3 attempts to enter data
		{

		System.out.println(" \n Enter PIN :");
		String pin = sc.next();

		if (pin.equals(password))
		{
		if (withdraw<balance)
		{
		balance -= withdraw; // To reduce amount from balance

	    System.out.print ("\n Amount Debited...");
	    continue Home; // It send back to home
		}

	    else
		{
	    System.out.print ("\n Insufficient Balance ..");
		}

		}

		else
		{
		if ((j-1)==0)
        {
		System.out.println(" \n wrong credentials...");
		System.exit(0); // Execution terminating

	    }
		else
		{
		System.out.println(" \n Wrong PIN...");
		System.out.println(" \n Attempt left : "+ (i-1));
		}
        }
        break;
	    }
        }

		case 3:
	    {
		for ( int k=3;k>0 ;k-- ) 
		{
		System.out.println(" \n Enter PIN :");
		String pin1 = sc.next(); 
		if (pin1.equals(password))
		{
		System.out.println(" \n Your Account Balance is : " + balance);
		continue Home;
		}
		else
		{
		if ((k-1)==0) // To check attempts left
        {
		System.out.println(" \n To many attempts .. \n Try After 2 Hours");
		}
		else
		{
	    System.out.println(" \n Re-Enter PIN : \n " + (k-1) +"Attempt left");
		}
        }
		continue Home;
        }
        }

		case 4:
		{
		//mini statement
		System.out.println("mini statement");
		continue Home;
        }

		case 5:
		{
		System.exit(0);
        }
		}
        }
        }

	    else
		{
	    if ((i-1)==0)
		{
        System.out.println(" \n Dont try to login with wrong credentials..  ");
		System.exit(0);
		}
		else
		{
		System.out.println(" \n Wrong Credentials...");
		System.out.println(" \n Attempt left : "+ (i-1));
		}
		}
		}

        }
        else if (opt==2) // If opt 2 choosed 
        {
 
        // Create account 
        System.out.println(" CREATE ACCOUNT ");
		System.out.print("\n ENTER USERNAME :");
		username = sc.next();

		System.out.print("\n ENTER PASSWORD :");
		password = sc.next();

		System.out.print("\n ENTER MOBILE NUMBER :");
		long number = sc.nextLong();

		System.out.print("\n ENTER YOUR ADDRESS : ");
		String address = sc.next();

		System.out.print("Deposite : ");
		balance = sc.nextDouble();

		System.out.println("\n ACCOUNT CREATED SUCCESSFULLY...");    
        }
        else
        {
        System.out.println("Invalid Option...");
        }


        }
    }
}
