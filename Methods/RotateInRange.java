class RotateInRange 
{
	public static void main(String[] args) 
	{
		int input = 1234;
		int rot = rotate(input);

		while (rot!=input)
		{
			System.out.println(rot);
			rot = rotate(rot);
		}
		System.out.println(rot);
	}

	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;

		int ct = count(num);

		return last * power(10,ct)+num;
	}

	public static int count (int num)
	{
		int ct = 0;
		while (num!=0)
		{
			num/=10;
			ct ++;
		}
		return ct;
	}

	public static int power(int digit,int ct)
	{
		int pow =1;

		for (int i=0;i<ct ;i++ )
		{
			pow = pow*digit ;

		}

		return pow;
	}
}
