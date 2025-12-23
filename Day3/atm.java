import java.util.Scanner;

class atm 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		float balance = 10000;
		boolean switch1 = true;
		float amt = 0;
		
		while (switch1)
		{
			
			System.out.println("What would you like to do");
			System.out.println("1-Withdraw");
			System.out.println("2-Deposit");
			System.out.println("3-Balance Enquiry");
			System.out.println("4-Exit");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch (option)
			{
			case 1:
				System.out.println("How much would you like to withdraw?");
				amt = sc.nextFloat();
				if ((balance>=amt)&&amt>0)
				{
					System.out.println("-------------------------------------------");
					System.out.println(amt+" withdrawn , remaining : "+(balance-amt));
					balance -= amt;;
				}
				else
				{
					System.out.println("-------------------------------------------");
					System.out.println("You broke blud, u dont have that much");
				}
				System.out.println("-------------------------------------------");
				break;
			case 2:
				System.out.println("How much would you like to deposit?");
				amt = sc.nextFloat();
				System.out.println("-------------------------------------------");
				System.out.println(amt+" deposited , remaining : "+(balance+amt));
				balance += amt;
				System.out.println("-------------------------------------------");
				break;
			case 3:
				System.out.println("-------------------------------------------");
				System.out.println("Remaining : "+balance);
				System.out.println("-------------------------------------------");
				break;
			case 4:
				switch1 = false;
				System.out.println("-------------------------------------------");
				System.out.println("Exiting...");
				System.out.println("-------------------------------------------");
				break;
			default:
				System.out.println("Enter a valid option");
			}
		}
		
	}
}
