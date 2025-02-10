class OtpGeneration 
{
	public static void main(String[] args) 
	{
		String otp = ""; // String with intial value 0
        
		// (Initialization) cnt is 1
		// (Condition) cnt goes until less than equal to 10
		for (int cnt = 1;cnt<=10 ; )
		{
			otp += (int)(Math.random()*100000); 

            // Math.random generated random number
            // Multiply it by 100000 to get 6 digit number 

            if (otp.length()==6) // If opt length is 6 then only print
			{
				System.out.println(otp);
                cnt++; // To track count of otp generation
			}
			otp= "   ";
		}
		
	}
}
