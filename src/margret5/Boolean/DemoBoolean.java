package margret5.Boolean;

public class DemoBoolean {

	public static void main(String[] args) {
		boolean finished = false;
		System.out.printf("Finished: %b%n",finished);
		
		boolean result = 2 + 2 == 3;
		boolean result1 = 2 + 3 != 6;
		System.out.printf("Result:%b%n",result);
		System.out.printf("Result1: %b%n",result1);
		// ! operator
		System.out.printf("!True: %b%n",!true);
		//private method
		Object result2 = isEven(12);
		System.out.printf("result of isEven(12) is:%b%n",result2);
	}

private static boolean isEven(int n)
{
	return n % 2 == 0;
	
}
}