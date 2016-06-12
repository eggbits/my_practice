package margret42.String_Class;

public class DemoReverse {
	public static void main(String args[])
	{
		String str1 = "radar";   
		StringBuffer sb1 = new StringBuffer(str1); 
		sb1.reverse(); 
		String str2 = sb1.toString();   
		if(str1.equals(str2))
		{ 
			System.out.println(str1 + " is palindrome"); // this prints
		} else 
		{ 
			System.out.println(str1 + " is not palindrome");
		} // all the above code can be converted into a single step using anonymous StringBuffer class.   
		System.out.println(str1.equals(new StringBuffer(str1).reverse().toString())); // prints true 
	}
}
