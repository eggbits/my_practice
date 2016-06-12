package margret28.ForeachLoop;

public class DemoForEach {

	public static void main(String[] args) {
		int[] numbers = {2,4,6,8,10};
		System.out.println(numbers.length);
		for(int i = 0; i < numbers.length;i++)
		{
			System.out.printf("%d ",numbers[i]);
		}
		System.out.println();
		for(int e1 : numbers)
		{
			System.out.printf("%d ",e1);
		}
	}
}
