package margret30.TwoDArray;

import java.util.Arrays;

public class DemoTowDArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]row0 = {1,2,3,4};
		int[]row1 = {5,6,7,8};
		int[][]table = {row0,row1};
		System.out.println(Arrays.toString(row0));
		System.out.println(Arrays.toString(row1));
		//System.out.println(Arrays.toString(table));
		for(int[] row:table)
		{
			System.out.println(Arrays.toString(row));
		}
		
		//Accessing elements
		int number = table [1][2];
		System.out.println(number);
	}

}
