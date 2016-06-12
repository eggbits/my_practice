package margret32.ClassArrays;

import java.util.Arrays;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char []vowels = {'a','e','i','o','u'};
 int index;
 for(char e1:vowels)
 {
	 index =Arrays.binarySearch(vowels, e1);
	 System.out.printf("%c..%d%n",e1,index);
 }
	}

}
