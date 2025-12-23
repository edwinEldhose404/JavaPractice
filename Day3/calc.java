import java.util.Scanner;

class calc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pick your operator 1. +, 2. - , 3.*, 4./");
		int option = sc.nextInt();
		sc.nextLine();
		
		
		switch (option)
		{
		case 1:
			System.out.println("Operand 1 : ");
			float o1 = sc.nextFloat();
			sc.nextLine();
		
			System.out.println("Operand 2 : ");
			float o2 = sc.nextFloat();
			sc.nextLine();
			
			System.out.println(o1 + " + " + o2 + " is " + (o1+o2));
			break;
		case 2:
			System.out.println("Operand 1 : ");
			o1 = sc.nextFloat();
			sc.nextLine();
		
			System.out.println("Operand 2 : ");
			o2 = sc.nextFloat();
			sc.nextLine();
			System.out.println(o1 + " - " + o2 + " is " + (o1-o2));
			break;
		case 3:
			System.out.println("Operand 1 : ");
			o1 = sc.nextFloat();
			sc.nextLine();
		
			System.out.println("Operand 2 : ");
			o2 = sc.nextFloat();
			sc.nextLine();
			System.out.println(o1 + " * " + o2 + " is " + (o1*o2));
			break;
		case 4:
			System.out.println("Operand 1 : ");
			o1 = sc.nextFloat();
			sc.nextLine();
		
			System.out.println("Operand 2 : ");
			o2 = sc.nextFloat();
			sc.nextLine();
			System.out.println(o1 + " / " + o2 + " is " + (o1/o2));
			break;
		default:
			System.out.println("Enter valid operator option");
		}
	}
}
