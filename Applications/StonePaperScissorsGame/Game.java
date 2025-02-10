import java.util.Scanner;
class Game 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner (System.in);
	  
      int rNum = 0; //store random num between 1 and 3

	  for (; ; )
	  {
	  
	  int num = (int)(Math.random()*10); //Math.random() function generates a double value from 0.0000 something
	                                     //We multiply same value by 10
									     //for getting an integer value from Math.random() function we used typecasting	
	 
	  if (num>=1 && num<=3) //Checked digit is between 1 to 3
	  {
		  rNum = num;
		  break; //if digit found between 1 to 3 then terminate loop
	  }
	  }

	  // Whatever random value is generated we need to map it with the option

	  String codeOpt = null;

	  if (rNum==1)
	  {
		  codeOpt = "STONE";
	  }
	  else if (rNum==2)
	  {
		  codeOpt = "PAPER";
	  }
	  else if (rNum==3)
	  {
		  codeOpt = "SCISSOR";
	  }

		System.out.println();
		System.out.println("WELCOME TO GAME");
		System.out.println();
		System.out.println("1.STONE 2.PAPER 3.SCISSOR");
		System.out.print("Enter the option:"); //Ask the user to enter the option

        int opt = sc.nextInt();

		String userOpt = null;

		if (opt==1)
		{
			userOpt = "STONE";
		}

		else if (opt==2)
		{
			userOpt = "PAPER";
		}

		else if (opt==3)
		{
			userOpt = "SCISSOR";
		}
        
		else
        {
			System.out.println("INVALID OPTION");
			return;   //If invalid option choosed then termination of execution
        }
   
        System.out.println("User:"+userOpt+" Bot:"+codeOpt);

        if ((opt==1 && rNum==3)||(opt==2 && rNum==1)||(opt==3 && rNum==2))
        {
			System.out.println("User WINS");
        }
        
		else if ((opt==1 && rNum==2)||(opt==2 && rNum==3)||(opt==3 && rNum==1))
		{
			System.out.println("Bot WINS");
		}

		else
		{
			System.out.println("MATCH DRAW");
		}
    
	}
  }

