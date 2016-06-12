package margret15.Algorithms;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInIntArray {

	public static void main(String[] args) {
		int[] array = {1,1,2,3,4,5,6,7,8,8};
		Set<Integer>set = new HashSet<Integer>();
		//System.out.println(set);
		for(int i = 0; i<array.length;i++)
		{
			//System.out.println(array[i]);
			//If same integer is already present then add method will return FALSE
			if(set.add(array[i]) == false)
			{
				System.out.println("Duplicate:"+array[i]);
			}
		}
	}

}
