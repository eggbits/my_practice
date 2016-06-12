package margret29.PassingArraysToMethods;

public class DemoPassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] verbs = {"Run","Play","Work","Go","Dance","Fight","Eat","Sleep"};
		demoPassArrayToMethod(verbs);
		
		System.out.println();
		
		short[] numbers = {5,3,4,6,6,6,};
		long product =demoPassArrayToMethod1(numbers);
		System.out.println(product);
		
	}
private static void demoPassArrayToMethod(String[] words)
{
	for(String wd : words)
	{
		System.out.printf("%s ",wd);
	}
	
}
private static Long demoPassArrayToMethod1(short[] numbers)
{
	long product = 1;
	for(short n : numbers)
	{
		product += n; //product = product + n;
	}
	return product;
	
}
}
