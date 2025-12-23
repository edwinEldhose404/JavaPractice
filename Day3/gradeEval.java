class gradeEval 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Grade (A-F) : ");
		String option = sc.next();
		
		switch (option)
		{
		case "F":
			System.out.println("Poor");
			break;
		case "D":
			System.out.println("Average");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "B":
			System.out.println("Very Good");
			break;
		case "A":
			System.out.println("Excellent");
			break;
		default:
			System.out.println("Enter valid input");
		}
	}
}
