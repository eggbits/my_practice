package margret28.ForeachLoop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DemoForEach3 {

	public static void main(String[] args) {

		test();
		test1();
	}
	private static void test()
	{
		List<Number> numbers = new ArrayList<>();
		numbers.add(new Integer(42));
		numbers.add(new Integer(-30));
		numbers.add(new BigDecimal("654.2"));

		//typical for-each loop
		//processes each item, without changing the collection or array.
		for (Number number : numbers){
			System.out.println(number);
		}
	}
	private static void test1()
	{
		ArrayList<String> list=new ArrayList<String>();  
		list.add("vimal");  
		list.add("sonoo");  
		list.add("ratan");  

		for(String s:list){  
			System.out.println(s);  
		}

	}}
