package margret4.DobleFloat;

import java.util.Scanner;

public class DemoDoble {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Number1: ");
		double number1 = input.nextDouble();
		System.out.println("Number2: ");
		double number2 = input.nextDouble();
		System.out.printf("Number1: %.2f%n",number1);
		System.out.printf("Number2: %.2f%n",number2);
		System.out.printf("Number2: %f%n",number2);
	}

}
