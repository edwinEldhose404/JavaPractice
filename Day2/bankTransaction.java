class bankTransaction 
{
	public static void main(String[] args) 
	{
		int balance = 4000;
		boolean active = true;
		boolean frozen = false;
		
		int withdraw =2000;
		System.out.println(balance>=withdraw && (active == true && frozen == false) ? "Allowed" : "Not allowed");
		
		withdraw =4001;
		System.out.println(balance>=withdraw && (active == true && frozen == false) ? "Allowed" : "Not allowed");
		
		
	}
}
