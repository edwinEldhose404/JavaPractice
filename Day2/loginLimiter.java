class loginLimiter 
{
	public static void main(String[] args) 
	{
		int attempts = 3;
		boolean locked = false;
		
		System.out.println(attempts<=3 && locked != true ? "Ok" : "Locked out");
	}
}
