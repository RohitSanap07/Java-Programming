class XylemNum
{
  public static void main(String []args)
  {
     System.out.print(isXylem(20));
  }

  public static boolean isXylem(int num)
  {
  	int sumExt = num%10;
  	int sumMid = 0;
  	num /=10;

  	while(num>10)
  	{
  		sumMid+=(num%10);
  		num/=10;
  	}

  	sumExt+=num;
  	return sumExt==sumMid;
  }

}

//If output is false then consider number is floam