package margret15.Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInStringArray {
	public static void main(String ar[])
	{
		String text = "a r b k c d se f g a d f s s f d s ft gh f ws w f v x s g h d h j j k f sd j e wed a d f";
		List<String> list = Arrays.asList(text.split(" "));
		System.out.println(list);
		Set<String> uniqueWords = new HashSet<String>(list);
		System.out.println(uniqueWords);
		for(String word:uniqueWords)
		{
			System.out.println(word +":"+Collections.frequency(list, word));
		}
	}

}
