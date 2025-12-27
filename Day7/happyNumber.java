import java.util.Scanner;

class happyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		numCalc(x);
	}
	
	public static void numCalc(int n)
	{
			
		int sum=0;
		int temp = 0;
		int innum = 0;
		int exit = 1;
		int counter = 0;
		
		//iterate between 0 to n
		for (int i = 1;i<=n;i++)
		{
			
			//reset variables
			counter = 0;
			innum = i;
			
			//exit if reached one or 10 iterations for each no
			while (exit==1 && counter<10)
			{
				
				//make all 3 digits
				if (innum<10)
				{
					innum*=100;
				}
				else if (innum<100)
				{
					innum*=10;
				}
				
				//adding sum of all no
				sum = 0;
				for (int j = 0;j<=2 ;j++ )
				{
					temp = innum%10;
					sum += temp*temp;
					innum -= temp;
					innum /= 10;
				}
				//make next no the sum
				innum=sum;
				
				//exit conditions
				if (innum==1)
				{
					System.out.println(i);
					exit= 0;
				}
				else if (innum==n)
				{
					System.out.println(i + " is not happy");
					exit =0;
				}
				//keep track of each iteration for each no
				counter++;
			}
			
			//reset exit variable
			exit = 1;
			
			
		}
	}
}
