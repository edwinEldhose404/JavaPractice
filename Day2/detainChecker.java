class detainChecker
{
	public static void main(String[] args) 
	{
		//Variable init
		double attend = 74.3;
		boolean medical = true;
		boolean fees = true;
		
		//Low attendence but medical
		boolean allowed = ((attend>=75.0 || medical == true) && fees == true) ? true : false;
		System.out.println(allowed==true ? "You are allowed to write the exam" : "You are detained");
		
		//Fees unpaid
		fees = false;
		allowed = ((attend>=75.0 || medical == true) && fees == true) ? true : false;
		System.out.println(allowed==true ? "You are allowed to write the exam" : "You are detained");
		
		//Has attendence and paid fees but no medical
		attend = 75.0;
		medical = false;
		fees = true;
		allowed = ((attend>=75.0 || medical == true) && fees == true) ? true : false;
		System.out.println(allowed==true ? "You are allowed to write the exam" : "You are detained");
		
		
	}
}
