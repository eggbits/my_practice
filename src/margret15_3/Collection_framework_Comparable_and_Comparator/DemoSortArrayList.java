package margret15_3.Collection_framework_Comparable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoSortArrayList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Hareesh");
		names.add("Rajesh");
		names.add("Anil");
		names.add("Babu");
		names.add("Anu");
		names.add("Lalli");
		names.add("Prasad");
		names.add("Sasi");
		Collections.sort(names);
		int i = 0;
		for(String kids : names)
		{
			System.out.println("names "+ ++i+ ":"+kids);
		}
	}

}
