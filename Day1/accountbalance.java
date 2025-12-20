class AccountBalance
{
	public static void main(String[] args) 
	{
		//Init variable
		int a = 10000;
		int b = 9000;
		int ac = 9500;
		
		//Check if withdrawal is greater than account balance
		String ans = (a>ac) ? "Error" : "Accepted";
		System.out.println(ans);
		ans = (b>ac) ? "Error" : "Accepted";
		System.out.println(ans);
	}
}
