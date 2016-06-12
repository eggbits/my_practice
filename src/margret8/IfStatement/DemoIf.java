package margret8.IfStatement;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Age: ");
		int Age = input.nextInt();
		if(Age > 20)
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("No Entry");
		}
	}

}
