class codingTest 
{
	public static void main(String[] args) 
	{
		boolean logic = true;
		boolean coding = true;
		boolean refferral = false;
		
		System.out.println((logic&&coding) || refferral ? "Yes" : "No");
		
		logic = false;
		coding = false;
		refferral = true;
		System.out.println((logic&&coding) || refferral ? "Yes" : "No");
	}
}
