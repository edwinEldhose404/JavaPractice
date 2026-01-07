class findPrime
{
	public static void main(String[] args) 
	{
		int[] arr = {3,5,6,7,8,11};
		int temp = 0;
		int prime = 1;
		
		for (int i=0;i<=arr.length ;i++ )
		{
			temp = arr[i];
			prime=1;
			for (int j=2;j<temp ;j++ )
			{
				if (temp%j==0)
				{
					System.out.println("Not a prime");
					prime=0;
					break;
				}
			}
			if (prime == 1)
			{
				System.out.println(temp);
			}
		}
	}
}
