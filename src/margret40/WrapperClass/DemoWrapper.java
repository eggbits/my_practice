package margret40.WrapperClass;

public class DemoWrapper {

	public static void main(String[] args) {
		int number = Integer.parseInt("123");
		System.out.printf("\"123\"...%d%n",number);
		System.out.printf("max integer value: %,d%n%n",Integer.MAX_VALUE);
		char ch = 'x';
		System.out.printf("%c is letter:  %b%n",ch ,Character.isLetter(ch));
		System.out.printf("%c is number:  %b%n",ch ,Character.isDigit(ch));
		System.out.printf("%c is uppercase:  %b%n",ch ,Character.isUpperCase(ch));
	}
}
