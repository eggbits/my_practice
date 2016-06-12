package margret15.Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String names[] = {"HAREESH","PRASAD","ANIL","SASI","LALLI","LALLI"};
		//CONVERT string array to list
		List<String>ls = Arrays.asList(names);
		//create a treeset with the list, which eliminates duplicates 
		TreeSet<String> unique = new TreeSet<String>(ls);
		System.out.println(unique);
	}

}
