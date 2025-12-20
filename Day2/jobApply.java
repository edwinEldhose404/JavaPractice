class jobApply 
{
	public static void main(String[] args) 
	{
		int experience = 2;
		boolean projExp = true;
		boolean grad = true;
		
		System.out.println((experience>=2 || projExp)&& grad ? "Yes" : "No");
		
		experience =0;
		projExp = false;
		System.out.println((experience>=2 || projExp)&& grad ? "Yes" : "No");
		
	}
}
