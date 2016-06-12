package margret28.ForeachLoop;

public class DemoForEach2 {

	public static void main(String[] args) {
		demoForEachWithArray();
		System.out.println();
		demoForEachWithArray1();
		System.out.println();
		demoForEachWithArray2();
	}
	private static void demoForEachWithArray()
	{
		char[] vowels = {'a','e','i','o','u'};
		for(char e : vowels)
		{
			System.out.printf("%c ",e);
		}
	}
	private static void demoForEachWithArray1()
	{
		double[] deci = {1.1,2.2,3.3,4.4,5.5,6.6};
		for(double de : deci)
		{
			System.out.printf("%f ",de);
		}
	}
	public static void demoForEachWithArray2()
	{
		String[] names = {"Hareesh","Rajesh","Anil","Prasad","Anu","Sasi","Babu"};
		for(String str : names)
		{
			System.out.printf("%s ",str);
		}
	}
}
