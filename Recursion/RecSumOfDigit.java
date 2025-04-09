class RecSumOfDigit 
{
	public static void main(String[] args) 
	{
		System.out.print(sumOfDigit(1234,0));
	}

	public static int sumOfDigit(int num,int sum)
	{
		if (num==0)
		{
			return sum;
		}

		return sumOfDigit(num/10,sum+=(num%10));

	}
}
