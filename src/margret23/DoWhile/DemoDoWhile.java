package margret23.DoWhile;

import java.util.Scanner;

public class DemoDoWhile {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Angle is radians: ");
		double angle = input.nextDouble();
		System.out.println();
		
		int choice;
		do
		{
		menuprompt();
		choice = input.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.printf("sin %.f%n",Math.sin(angle));
			case 2: 
				System.out.printf("cos %.f%n",Math.cos(angle));
			case 3: 
				System.out.printf("tan %.f%n",Math.tan(angle));
			case 0: 
				System.out.println("good bye");
			default: 
				System.out.printf("Invalid Selection");
				break;
		}
		System.out.println();
		}
		while(choice != 0);
		{
			System.out.println();
		}
	}
	private static void menuprompt()
	{
		System.out.println("1 .. sin");
		System.out.println("2 .. cos");
		System.out.println("3 .. tan");
		System.out.println("4 .. exit");
		System.out.println("Your choice:");
	}

}
