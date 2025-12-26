import java.util.Scanner;

class  loanChecker
{
	public static void main(String[] args) 
	{
		//Loan Eligibility Checker 
		//Design a method that accepts monthly Income, credit Score, and 
		//loan Amount and returns eligibility status
		
		Scanner sc = new Scanner(System.in);
		boolean cont = true;
		int count = 0;
		
		while (cont)
		{
			//input
			System.out.println("Enter per annum income : ");
			double inc = sc.nextDouble();
			
			System.out.println("Enter credit score : ");
			double cs = sc.nextDouble();
			
			System.out.println("Enter loan amount : ");
			double loanAmt = sc.nextDouble();
			
			//check if eligible
			if (checker(inc,cs,loanAmt)==0)
			{
				System.out.println("Not eligible");
			}
			else
			{
				System.out.println("Eligible");
				count += 1;
			}
			
			//Continue
			System.out.println("Continue? 1/0");
			int check = sc.nextInt();
			
			//check for continues using input and count
			if (check!=1 && count<10)
			{
				cont = false;
			}
		}
	}
	
	public static int checker(double inc, double cs, double loanAmt)
	{
		//modifier extracted from credit score
		double modifier = (cs*1.125)/1000;
		
		//calculate maximum loan amount for user and compare with proposed
		if ((loanAmt>((inc*3)*modifier)))
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
