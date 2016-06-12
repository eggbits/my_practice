package margret28.ForeachLoop;

public class DemoForEach1 {

	public static void main(String[] args) {
		demoForEachWithArray();
	}
	private static void demoForEachWithArray()
	{
		int[] number = {2,4,6,8,10};
		System.out.println(number.length);
		for(int j = 0; j < number.length;j++)
		{
			System.out.printf("%d ",number[j]);
		}
		System.out.println();
		for(int e1 : number)
		{
			System.out.printf("%d ",e1);
		}
	}
}
