package margret42.String_Class;

public class StringReverse {

	public static void main(String[] args) {
		String sName = "Hareesh Arava";
		System.out.println(sName);
		StringBuffer sbName = new StringBuffer(sName);
		System.out.println("string before reversing sbName:  "+sbName);
		sbName.reverse();
		System.out.println("string after reversing sbName:  "+sbName);

		System.out.println("All in one line: " + new StringBuffer(sName).reverse()); // all in one line
		
		System.out.println(sbName.toString());

	}

}
