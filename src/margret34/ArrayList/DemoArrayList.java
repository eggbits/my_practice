package margret34.ArrayList;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> fruit = new ArrayList<String>();
		System.out.println(fruit);
		//adding elements
		fruit.add("Apple");
		fruit.add("Orange");
		fruit.add("Mango");
		System.out.println(fruit);
		//removing elements
		fruit.remove("Apple");
		System.out.println(fruit);
		//check whether elements are included in list
		boolean containsKivi = fruit.contains("Kivi");
		System.out.println(containsKivi);
		//index of element
		int indexofOrange = fruit.indexOf("Orange");
		System.out.printf("indexofOrange: %d",indexofOrange);
		System.out.println();
		fruit.clear();
		System.out.println(fruit);
	}

}
