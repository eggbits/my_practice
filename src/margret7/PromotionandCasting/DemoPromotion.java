package margret7.PromotionandCasting;

public class DemoPromotion {

	public static void main(String[] args) {
		int a = 100;
		int b = 20;
		double result = a/b; //Promotion is implicit type conversion (suggested though not directly expressed)
		System.out.println(result); //The result automatically converted to double
		 int nresult = (int) (result); //explicit conversion
		 System.out.println(nresult);
		 int z = (int)Math.round(3.1);
		 System.out.println(z);
		 int y = (int)Math.round(3.9);
		 System.out.println(y);
		 int x = 'A' + 1;
		 char newChar = (char)x;
		 System.out.println(newChar);
	}
}
