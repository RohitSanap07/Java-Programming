class ArmstrongInRange 
{
	public static void main(String[] args) 
	{
		int start = 10;
		for (int i=start;i<=1000 ;i++ )
		{
			if(isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		int sum =0;

		for (int i = num ;i!=0 ;i/=10 )
		{
			sum =sum + power(i%10,ct);

		}
		  return num == sum;
    }

	public static int count (int num)
	{
		int ct = 0;
		
		while (num!=0)
		{
			num/=10;
			ct++;
		}
		return ct;
	}

	public static int power(int digit ,int ct)
	{
		int pow = 1;

		for (int i =0;i<ct ;i++ )
		{
			pow = pow * digit;
		}
		return pow;
	}


}
