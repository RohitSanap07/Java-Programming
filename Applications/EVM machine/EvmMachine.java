import java.util.Scanner;
class EvmMachine 
{
	public static void main(String[] args) 
	{
	  
       Scanner sc = new Scanner(System.in);

       System.out.println();
	   System.out.println("-----------Welcome------------");
	   System.out.println();
	   System.out.print("Enter the population:");
	   

	   int bjp =0,cng =0,ss=0,aap=0,mns=0,nota=0; // Initial votes are 0 for parties

	   int population = sc.nextInt(); // Population as input

	   for (int i=1;i<=population; i++) // Loop starts from one and goes until entered population
	   {
		   System.out.println();
		   System.out.println("**** LIST OF PARTIES ****");
		   System.out.println("1. BJP");
		   System.out.println("2. CONGRESS");
		   System.out.println("3. SHIVSENA");
		   System.out.println("4. AAP");
		   System.out.println("5. MNS");
		   System.out.println("6. NOTA");
		   System.out.println();
		   System.out.print("Enter your choice:");

		   int opt = sc.nextInt(); // Enter opt to choose
           
		   // To give votes for parties
           if(opt>=1 && opt<=6) // If option is between 1 and 6
           {
           
	       if (opt==1)
           {
	        bjp++; // If opt 1 is choosed then vote added in bjp variable
	       System.out.println("ACHE DIN AYENGE"); // and slogan is printing
           }
	       if (opt==2)
	       {
		   cng++;
		   System.out.println("BHARAT JODO");
	       }
  
           if (opt==3)
	       {
		    ss++;
		   System.out.println("GARV SE KAHO HUM HINDU HAI");
	       }
  
           if (opt==4)
	       {
		    aap++;
		   System.out.println("JANTA KI SARKAR, JANTA KE DWAR");
	       }
  
           if (opt==5)
	       {
		    mns++;
		   System.out.println("JAI MAHARASTRA");
	       }
  
           if (opt==6)
	       {
		    nota++;
		   System.out.println("IF THEY CAN'T DELIEVER, THEY DON'T DESERVE – NOTA!");
   }
}

           if (!(opt>=1 && opt<=6)) // If option choosed is not between 1 to 6 then invalid option 
	       {
		    i--; // Iteration is minus if it is invalid 
		   System.out.println("You choosed Invalid Option");
   }

}	
         // Determine the result with total votes of parties 
         if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
         { 
			System.out.println("BJP HAS WON THE ELECTION BY"+bjp+" votes ");
         } 
        else if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
         {
            System.out.println("CNG HAS WON THE ELECTION BY"+cng+" votes ");
         }
	  
       else if(ss>=cng && ss>=bjp && ss>=aap && ss>=mns && ss>=nota)
         { 
            System.out.println("SS HAS WON THE ELECTION BY"+ss+" votes ");
         }

       else if (aap>=cng && aap>=ss && aap>=bjp && aap>=mns && aap>=nota)
        {
            System.out.println("AAP HAS WON THE ELECTION BY"+aap+" votes ");
        }

       else if (nota>=cng && nota>=ss && nota>=bjp && nota>=aap && nota>=mns)
        {
            System.out.println("NOTA GETS HIGHEST VOTES"+mns+" votes ");
        }

       else if (mns>=cng && mns>=ss && mns>=bjp && mns>=aap && mns>=nota)
        {
	        System.out.println("MNS HAS WON THE ELECTION BY"+mns+" votes ");
        }
	   
}
}
