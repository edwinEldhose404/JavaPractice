import java.util.Scanner;

class  bankBalance
{
	public static void main(String[] args) 
	{
		//Bank Transaction Validation 
		//Create a parameterized method that 
		//accepts account Balance and withdraw Amount and decides whether 
		//the transaction can proceed. The method should return a 
		//meaningful message instead of printing directly.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter balance amount : ");
		int balance = sc.nextInt();
		System.out.println("Enter withdraw amount : ");
		int withdraw = sc.nextInt();
		
		System.out.println(withdraw(balance,withdraw));
		
	}
	
	public static String withdraw(int b, int w) 
	{
		if (b>=w)
		{
			return ("You don't have enough balance to initiate this transaction");
		}
		else
		{
			return ("Transaction completed");
		}
	}
}
