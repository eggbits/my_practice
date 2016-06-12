package margret15_3.Collection_framework_Comparable_and_Comparator;

import java.util.Arrays;

public class DemoSortArray {

	public static void main(String[] args) {
	String[]names = {"Hareesh","Anu","Lalli","Lakshmi","Rajesh","Babu","Siva","Rekha","Srinivas","Prasad","Latha","Sasi","Ramappa"};
	Arrays.sort(names);
	int i = 0;
	for(String members:names)
	{
		System.out.println("name:"+ ++i+":"+members);
	}
	}
}
