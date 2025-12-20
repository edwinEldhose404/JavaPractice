class mobileAppFeature
{
	public static void main(String[] args) 
	{
		boolean loggedIn = true;
		boolean terms = true;
		
		System.out.println(loggedIn&&terms ? "Yes" : "No");
		
		terms = false;
		System.out.println(loggedIn&&terms ? "Yes" : "No");
	}
}
