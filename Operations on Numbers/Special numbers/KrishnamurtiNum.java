class KrishnamurtiNum 
{
	public static void main(String[] args) 
	{
		int  num = 145;
		int sum = 0;

		for (int i = num; i>0; i/=10)
		{
			int rem = i%10;
			int fact = 1;
			for (int j=1;j<=rem ;j++ )
			{
				fact *=j;
			}
			sum +=fact;
}
 System.out.print(sum==num?"Number is Krishnamurti":"Number is not Krishnamurti");
		
	}
}
