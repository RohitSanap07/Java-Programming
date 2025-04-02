class LcmOfNumber
{
	public static void main(String[]args)
{
	int n1 = 11;
	int n2 = 7;

	int max = n1>n2?n1:n2;

	int i = 1;

	while(true){

		if ((max*i)%n1==0 && (max*i)%n2==0)
		{
			System.out.println(max*i);
			break;
        }
        i++;
        }
    }
}

