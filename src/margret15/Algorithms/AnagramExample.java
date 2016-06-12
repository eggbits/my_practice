package margret15.Algorithms;

import java.util.HashSet;

public class AnagramExample {

	public static void main(String[] args) {
		String [] rawlist = {"abc","cba","Bca","bac","xyz","zyx","123","321"};
		//This will store unique strings
		HashSet<String> uniqueStrings = new HashSet<String>();
		//Get all anagrams and sort it's chars and store in set
		for(String s : rawlist)
		{
			uniqueStrings.add(sortSting(s.toLowerCase()));
		}
		//We got unique strings here; Great !!
		System.out.println(uniqueStrings);

	}
	//Function to sort all chars inside a string
	private static String sortSting(String s) {

		char[] c = s.toCharArray();        //Convert to array of chars
		java.util.Arrays.sort(c);          //Sort chars
		return new String(c);             //Return sorted String
	}

}








/*Hi, One of the interview they asked me to write a program for the below. mentioned logic.

input : { “abc”,”cba”,”BCa”,”bac”,”xyz”,”zyx”,”123″,”321″…} list of anagrams.

then output should be : { “abc”,”xyz”,”123″}.

Could you please helpw the logic behind this.*/