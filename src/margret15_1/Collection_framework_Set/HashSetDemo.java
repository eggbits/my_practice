package margret15_1.Collection_framework_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet <String> hs = new HashSet<String>();
		hs.add("Hareesh");
		hs.add("Hareesh");
		hs.add("Rajesh");
		hs.add("Anil");
		System.out.println(hs); //hs elements retun
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	}

}
