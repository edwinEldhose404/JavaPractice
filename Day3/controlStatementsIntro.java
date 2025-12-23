import java.util.Scanner;

class  ControlStatementsIntro
{
	public static void main(String[] args) 
	{
		//Types
			//Decision Making Statements
				//If, if else, if else ladder, switch and nested if
					//Switch(takes a variable), case(takes only expression/values) and default
						//Default block is optional and can contain anything(even switch)
						//Case cannot accept bool, float, double,and long datatypes
			//Looping statement
				//Do while, while, for, for each, nested loop
			//Jumping statement
				//continue, break, return
		
		Scanner scanner = new Scanner(System.in);
		
		boolean avalDriver = true;
		
		boolean service = true;
		
		System.out.println("What is your payment method? (Cash,UPI,Card(Credit or Debit)): ");
		String payment = scanner.nextLine(); 
		
		if ((avalDriver && service) && (payment=="Cash",payment=="UPI",payment=="Card"))
		{
			System.out.println("Your cab will arrive shortly");
		}else{
			System.out.println("Not available");
		}
	}
}
