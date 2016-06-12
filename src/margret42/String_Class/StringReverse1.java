package margret42.String_Class;

public class StringReverse1 {

	public static void main(String[] args) {
		String sName = "HAREESH";
		String sTemp = "";
		int length = sName.length();
		System.out.println(length);
		for(int i =length-1;i >= 0; i--)
		{
			sTemp = sTemp + sName.charAt(i);
		}
		System.out.println(sTemp);
	}

}
