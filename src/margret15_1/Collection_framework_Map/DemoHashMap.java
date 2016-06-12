package margret15_1.Collection_framework_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DemoHashMap {

	public static void main(String[] args) {
		Map<Object,String> testMap = new HashMap<Object,String>();
		testMap.put(278, "Hareesh");
		testMap.put(279, "Prasad");
		testMap.put(280, "Anudeep");
		//null key
		testMap.put(null, "sandeep");
		//null value
		testMap.put(274, null);
		System.out.println();
	}
}
